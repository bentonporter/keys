package com.bentonporter;

import com.google.common.base.Throwables;
import com.google.common.io.BaseEncoding;
import org.apache.commons.lang3.RandomStringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Generator {
    private static final String HMAC_SHA256 = "HmacSHA256";
    private static final String UTF_8 = "UTF-8";

    public Key generateKey() {
        return Key.builder()
                .apiKey(createApiKey())
                .secretKey(createSecretKey())
                .build();
    }

    private String createApiKey() {
        return RandomStringUtils.randomAlphanumeric(16);
    }

    private String createSecretKey() {
        try {
            String randomString = RandomStringUtils.random(32);
            byte[] randomBytes = randomString.getBytes(UTF_8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(randomBytes, HMAC_SHA256);
            Mac mac = Mac.getInstance(HMAC_SHA256);
            mac.init(secretKeySpec);
            mac.update(randomBytes);
            byte[] secretKeyBytes = mac.doFinal();
            return BaseEncoding.base64().encode(secretKeyBytes);

        } catch (Exception e) {
            throw Throwables.propagate(e);
        }
    }
}

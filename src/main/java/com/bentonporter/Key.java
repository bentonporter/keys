package com.bentonporter;

import lombok.experimental.Builder;

@Builder
public class Key {
    private final String apiKey;
    private final String secretKey;
}

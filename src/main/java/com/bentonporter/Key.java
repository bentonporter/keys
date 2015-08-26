package com.bentonporter;

import lombok.Builder;

@Builder
public class Key {
    private final String apiKey;
    private final String secretKey;
}

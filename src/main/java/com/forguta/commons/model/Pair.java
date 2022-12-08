package com.forguta.commons.model;

import lombok.Data;

@Data(staticConstructor = "of")
public class Pair<F, S> {
    private final F first;
    private final S second;
}

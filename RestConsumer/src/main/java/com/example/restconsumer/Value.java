/**
 * @author      : Linus Fernandes (linusfernandes at gmail dot com)
 * @file        : Value
 * @created     : Saturday May 13, 2023 13:04:42 IST
 */
package com.example.restconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Value(Long id, String quote) { }

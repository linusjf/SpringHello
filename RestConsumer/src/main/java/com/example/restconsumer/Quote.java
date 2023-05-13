/**
 * @author      : Linus Fernandes (linusfernandes at gmail dot com)
 * @file        : Quote
 * @created     : Saturday May 13, 2023 13:02:20 IST
 */
package com.example.restconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, Value value) { }

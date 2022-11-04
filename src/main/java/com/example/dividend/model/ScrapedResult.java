package com.example.dividend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class ScrapedResult {

    private Company company;
    private List<Dividend> dividendEntities; // 한 회사는 여러개의 배당금을 갖고 있다.

    public ScrapedResult() {
        this.dividendEntities = new ArrayList<>();
    }
}

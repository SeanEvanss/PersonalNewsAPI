package com.seanevans.customfeed.service;

import java.util.List;

/*
*This interface defines the functionality we expect with regards to GPT-3.
*  */
public interface GPTService {

    String summariseArticle(String unsummarisedArticle);

    List<String> summariseArticles(List<String> unsummarisedArticles);
}

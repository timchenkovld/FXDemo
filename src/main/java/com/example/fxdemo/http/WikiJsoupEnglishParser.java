package com.example.fxdemo.http;

//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//import java.util.HashSet;
//import java.util.Set;
//
//public class WikiJsoupEnglishParser {
//    public Set<String> englishNamesCitiesParse() throws IOException {
//        String url = "https://en.wikipedia.org/wiki/List_of_cities_in_Ukraine";
//        Document document = Jsoup.connect(url).get();
//        Set<String> englishCityNames = new HashSet<>();
//        Elements elements = document.select("a.extiw");
//        for (Element element : elements) {
//            String cityName = element.text();
//            englishCityNames.add(cityName);
//        }
//        return englishCityNames;
//    }
//    public static void main(String[] args) {
//        WikiJsoupEnglishParser parser = new WikiJsoupEnglishParser();
//        try {
//            Set<String> englishCityNames = parser.englishNamesCitiesParse();
//            for (String cityName : englishCityNames) {
//                System.out.println(cityName);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}


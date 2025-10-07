package com.example.demo;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(8081);
        get("/hello", (req, res) -> "Hello Jenkins Monitoring!");
    }
}

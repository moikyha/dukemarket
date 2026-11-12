module br.eti.moikyha.dukemarket.javafx {

requires javafx.controls;
requires javafx.fxml;
requires java.base;

requires java.sql;

opens br.eti.moikyha.dukemarket.javafx to javafx.fxml;
opens br.eti.moikyha.dukemarket.javafx.controller to javafx.fxml;

exports br.eti.moikyha.dukemarket.javafx;
exports br.eti.moikyha.dukemarket.javafx.controller;
exports br.eti.moikyha.dukemarket.javafx.DAO;
exports br.eti.moikyha.dukemarket.javafx.model;
exports connection;

requires mysql.connector.java;

}

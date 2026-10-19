package com.example.project2.demo.model;

import jakarta.persistence.*;

@Entity
public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int numberOfSeats;

    private boolean elevatorAccess;
    private boolean projector;
    private boolean whiteboard;
    private boolean computerAccess;
    private boolean largeTable;
    private boolean quietRoom;

    private boolean booked = false;

    // 🔥 NEW FIELDS
    private String bookedByName;
    private String bookedByEmail;

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isElevatorAccess() {
        return elevatorAccess;
    }

    public void setElevatorAccess(boolean elevatorAccess) {
        this.elevatorAccess = elevatorAccess;
    }

    public boolean isProjector() {
        return projector;
    }

    public void setProjector(boolean projector) {
        this.projector = projector;
    }

    public boolean isWhiteboard() {
        return whiteboard;
    }

    public void setWhiteboard(boolean whiteboard) {
        this.whiteboard = whiteboard;
    }

    public boolean isComputerAccess() {
        return computerAccess;
    }

    public void setComputerAccess(boolean computerAccess) {
        this.computerAccess = computerAccess;
    }

    public boolean isLargeTable() {
        return largeTable;
    }

    public void setLargeTable(boolean largeTable) {
        this.largeTable = largeTable;
    }

    public boolean isQuietRoom() {
        return quietRoom;
    }

    public void setQuietRoom(boolean quietRoom) {
        this.quietRoom = quietRoom;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getBookedByName() {
        return bookedByName;
    }

    public void setBookedByName(String bookedByName) {
        this.bookedByName = bookedByName;
    }

    public String getBookedByEmail() {
        return bookedByEmail;
    }

    public void setBookedByEmail(String bookedByEmail) {
        this.bookedByEmail = bookedByEmail;
    }
}
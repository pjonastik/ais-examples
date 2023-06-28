package org.example.tasks.light;

public class LightBulb {
        private boolean state = false;
        public boolean read() { return state; }
        public void on() { state = true; }
        public void off() { state = false;  }
        public String toString() { return state ? "on" : "off"; }
    }
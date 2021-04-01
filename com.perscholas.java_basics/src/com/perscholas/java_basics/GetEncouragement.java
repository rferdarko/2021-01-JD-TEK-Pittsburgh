package com.perscholas.java_basics;

    public class GetEncouragement {

        public static void GetEncouragement(int grade) {
            String output;
            switch (grade / 10) {
                case 10:
                    output = "Wow";
                    break;
                case 9:
                    output = "Excellent";
                    break;
                case 8:
                    output = "Very Good";
                    break;
                case 7:
                    output = "Good";
                    break;
                default:
                    output = "Keep Trying; break";
            }
            System.out.println(output);
        }
    }


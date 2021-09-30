/////////////////////////////////
// By: Tommy Subaric
// Description: takes in year and outputs
// month,day,year of Easter that year
/////////////////////////////////
    public class Computus {
        private int year; //input
        private String month; //string used later to turn int into string

        public Computus(int year) { //Constructor sets year
            this.year = year;
        }

        public int getYear() { //gets year
            return year;
        }

        public String getDate() { //uses Gregorain algorithm to solve for month and day
            int a = year % 19;
            int b = (int) Math.floor(year / 100);
            int c = year % 100;
            int d = (int) Math.floor(b / 4);
            int e = b % 4;
            int f = (int) Math.floor((b + 8) / 25);
            int g = (int) Math.floor((b - f + 1) / 3);
            int h = (19 * a + b - d - g + 15) % 30;
            int i = (int) Math.floor(c / 4);
            int k = c % 4;
            int l = (32 + 2 * e + 2 * i - h - k) % 7;
            int m = (int) Math.floor((a + 11 * h + 22 * l) / 451);
            int n = (int) Math.floor((h + l - 7 * m + 114) / 31);
            int o = (((h + l - (7 * m) + 114) % 31) + 1);

            if (n == 3) { //uses month string and n to assign month name
                month = "March";
            } else if (n == 4) {
                month = "April";
            } else if (n == 5) {
                month = "May";
            }
            return ("Easter: " + month + ", " + o + ", " + year); //part I output
        }

    }

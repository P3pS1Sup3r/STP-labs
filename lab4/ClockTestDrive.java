package lab4;

class Clock {
    String time;

    void setTime (String t) {
        time = t;
    }

    void getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
         Clock c = new Clock();

         c.setTime("1245");
         String tod = c.getTime();
         System.out.println("время " + tod);
    }    
}

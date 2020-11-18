package day_12Programming;

public class Browser {
    public static void main(String[] args) {
        String browserName = "opera";
        String selectBrowser = " ";
        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" ||
                browserName == "safari") {
            if (browserName == "chrome") {
                selectBrowser = "Chrome Browser is Selected";
            } else if (browserName == "firefox") {
                selectBrowser = "Firefox Browser is Selected";
            } else if (browserName == "opera") {
                selectBrowser = "Opera Browser is Selected";
            } else {
                selectBrowser = "Safari Browser is Selected";
            }

        } else {
            selectBrowser = "Invalid Browser Name";
        }
        System.out.println(selectBrowser);
        System.out.println("======================================");

        String browserIs = " ";
        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" ||
                browserName == "safari") {
            browserIs = (browserName == "chrome") ? "Chrome Browser is Selected"
                    : (browserName == "firefox") ? "Firefox Browser is Selected"
                    : (browserName == "opera") ? "Opera Browser is Selected"
                    : "Safari Browser is Selected";
        } else {
            browserIs = "Invalid Browser Name";
        }
        System.out.println(browserIs);
      }
    }

/*
write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
                browserName =   "cybertek";
                output:
                    Invalid Browser Name

 */
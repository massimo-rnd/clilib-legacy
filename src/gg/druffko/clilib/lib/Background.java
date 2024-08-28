package gg.druffko.clilib.lib;

public class Background {
    private static final String reset = TextColors.reset;

    public static String white(String string) {
        return TextColors.bgwhite + string + reset;
    }

    public static String red(String string) {
        return TextColors.bgred + string + reset;
    }

    public static String green(String string) {
        return TextColors.bggreen + string + reset;
    }

    public static String yellow(String string) {
        return TextColors.bgyellow + string + reset;
    }

    public static String blue(String string) {
        return TextColors.bgblue + string + reset;
    }

    public static String purple(String string) {
        return TextColors.bgpurple + string + reset;
    }

    public static String cyan(String string) {
        return TextColors.bgcyan + string + reset;
    }

    public static String grey(String string) {
        return TextColors.bggrey + string + reset;
    }
}

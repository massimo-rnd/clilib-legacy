package gg.druffko.clilib.lib;

public class Lining {
    private static final String reset = TextStyles.reset;

    public static String underline(String liningString) {
        return TextStyles.underline + liningString + reset;
    }

    public static String dunderline(String liningString) {
        return TextStyles.dunderline + liningString + reset;
    }

    public static String cunderline(String liningString) {
        return TextStyles.cunderline + liningString + reset;
    }

    public static String strikethrough(String liningString) {
        return TextStyles.strikethrough + liningString + reset;
    }

    public static String overline(String liningString) {
        return TextStyles.overline + liningString + reset;
    }
}

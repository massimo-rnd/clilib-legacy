package gg.druffko.clilib.test;

import gg.druffko.clilib.lib.TextColors;
import gg.druffko.clilib.lib.TextStyles;

// Note:
// This class is supposed to be a demo for everything that is possible with this lib.
// Since this library might be extended in the future, here you can always see what the current version has to offer.

public class Main {
    public static void main(String[]args){
        System.out.println("clilib - demo");
        System.out.println("Rendering all available properties...");

        // A list of all (single not combined) properties
        System.out.println(TextColors.black + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.red + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.green + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.yellow + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.blue + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.purple + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.cyan + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.white + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.bgwhite + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.bgred + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.bggreen + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.bgyellow + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.bgblue + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.bgpurple + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.bgcyan + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextColors.bggrey + "Look at what I can do!" + TextColors.reset);

        System.out.println(TextStyles.bold + "Look at what I can do!" + TextStyles.reset);
        System.out.println(TextStyles.italic + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextStyles.dim + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextStyles.blink + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextStyles.reverse + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextStyles.invisible + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextStyles.underline + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextStyles.dunderline + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextStyles.cunderline + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextStyles.strikethrough + "Look at what I can do!" + TextColors.reset);
        System.out.println(TextStyles.overline + "Look at what I can do!" + TextColors.reset);
    }
}

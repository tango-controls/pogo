package fr.esrf.tango.pogo.generator.pr;

import java.util.regex.Pattern;

import net.danieldietrich.protectedregions.core.IRegionOracle;

public class PogoPR implements IRegionOracle {
    private static final String ID = "([a-zA-Z_$][a-zA-Z\\d_$]*\\.)*[a-zA-Z_$][a-zA-Z\\d_$:]*";

    private Pattern start;
    private Pattern end;

    public PogoPR () {
      String label = "PROTECTED\\s+REGION";
      start =
          Pattern.compile("\\s*" + label + "\\s+ID\\s*\\(\\s*" + ID
              + "\\s*\\)\\s+(ENABLED\\s+)?START\\s*");
      end = Pattern.compile("\\s*" + label + "\\s+END\\s*");
    }

    //@Override
    public boolean isMarkedRegionStart(String s) {
      return start.matcher(s).matches();
    }

    //@Override
    public boolean isMarkedRegionEnd(String s) {
      return end.matcher(s).matches();
    }

    //@Override
    public String getId(String markedRegionStart) {
      int i = markedRegionStart.indexOf("(");
      int j = i + 1 + markedRegionStart.substring(i + 1).indexOf(")");
      return (i != -1 && j != -1) ? markedRegionStart.substring(i + 1, j).trim() : null;
    }

    //@Override
    public boolean isEnabled(String markedRegionStart) {
      return markedRegionStart.contains("ENABLED");
    }

}

package fr.esrf.tango.pogo.generator.pr;

import java.util.regex.Pattern;

import net.danieldietrich.protectedregions.core.IRegionOracle;

public class PogoPR implements IRegionOracle {
    private static final String ID = "[a-zA-Z\\d_$:\\.\\s]*";

    private Pattern start;
    private Pattern end;

    public PogoPR () {
      start =
          Pattern.compile("PROTECTED\\s+REGION\\s+ID\\s*\\(\\s*[a-zA-Z\\d_\\.\\s:]*\\s*\\)\\s+(ENABLED\\s+)?START");
      end = Pattern.compile("PROTECTED\\s+REGION\\s+END");
    }

    //@Override
    public boolean isMarkedRegionStart(String s) {
      return start.matcher(s).find();
    }

    //@Override
    public boolean isMarkedRegionEnd(String s) {
      return end.matcher(s).find();
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

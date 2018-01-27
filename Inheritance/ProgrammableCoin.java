package Inheritance;


public class ProgrammableCoin extends CryptoCurrency
{
    private String script = "";
    ProgrammableCoin(String name)
    {
        super(name);
    }

    ProgrammableCoin(String name, String symbol, String description, int circulatingSupply, int marketCap)
    {
        super(name, symbol, description, circulatingSupply, marketCap);
    }

    public void setScript(String scriptArg)
    {
        script += scriptArg;
    }

    public String getScript()
    {
        return script;
    }

    @Override
    public String toString()
    {
        String results = "";
        results += formatInstanceData();
        results += "Script:\n"+getScript()+"\n\n";
        results += divdingLine();
        return results;
    }


    @Override
    public boolean equals(Object object)
    {
        if(object instanceof ProgrammableCoin)
        {
            ProgrammableCoin pc = (ProgrammableCoin) object;
            return allDataSame(pc.getName(), pc.getSymbol(), pc.getDescription(), pc.getCirculatingSupply(), pc.getMarketCap());
        }
        else
        {
            return false;
        }
    }
}

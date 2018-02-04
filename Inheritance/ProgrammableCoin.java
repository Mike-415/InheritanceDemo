package Inheritance;

public class ProgrammableCoin extends CryptoCurrency
{
    private String script = "";
    public ProgrammableCoin(String name)
    {
        super(name);
    }

    public ProgrammableCoin(String name, String symbol, String description, int circulatingSupply, int marketCap)
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
        results += super.toString();
        results += "Script:\n"+getScript()+"\n\n";
        results += CryptoCurrency.getDividingLine();
        return results;
    }
    
    @Override
    public boolean equals(Object object)
    {
        if(object instanceof ProgrammableCoin)
        {
            return super.equals(object);
        }
        return false;
    }
}

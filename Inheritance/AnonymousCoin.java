package Inheritance;


public class AnonymousCoin extends CryptoCurrency
{

    public AnonymousCoin(String name)
    {
        super(name);
    }
    public AnonymousCoin(String name, String symbol, String description, int circulatingSupply, int marketCap)
    {
        super(name, symbol, description, circulatingSupply, marketCap);
    }

    public String getHashingAlgoType()
    {
        return "SHA3-256 (quantum-proof)";
    }

    @Override
    public String toString()
    {
        String results = "";
        results += formatInstanceData();
        //results += "Script:\t"+getScript()+"\n\n";
        results += "Hash algorithm:\t\t"+getHashingAlgoType()+"\n\n";
        results += divdingLine();
        return results;
    }



    @Override
    public boolean equals(Object object)
    {
        if(object instanceof AnonymousCoin)
        {
            AnonymousCoin ac = (AnonymousCoin) object;
            return allDataSame(ac.getName(), ac.getSymbol(), ac.getDescription(),
                    ac.getCirculatingSupply(), ac.getMarketCap());
        }
        else
        {
            return false;
        }
    }

}

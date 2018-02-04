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
        results += super.toString();
        results += "Hash algorithm:\t\t"+getHashingAlgoType()+"\n\n";
        results += CryptoCurrency.getDividingLine();
        return results;
    }
    
    @Override
    public boolean equals(Object object)
    {
        if(object instanceof AnonymousCoin)
        {
            return super.equals(object);
        }
        return false;
    }
}

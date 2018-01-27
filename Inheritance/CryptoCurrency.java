package Inheritance;

import java.text.DecimalFormat;


public class CryptoCurrency
{
    public static String DEFAULT_STRING = "";
    public static int DEFAULT_INT = 0;
    private String name, symbol, description;
    private int circulatingSupply, marketCap;
    private double price;



    public CryptoCurrency(String name)
    {
        this(name, DEFAULT_STRING, DEFAULT_STRING, DEFAULT_INT, DEFAULT_INT);
    }

    public CryptoCurrency(String name, String symbol, String description, int circulatingSupply, int marketCap)
    {
        this.name = name;
        this.symbol = symbol;
        this.description = description;
        this.circulatingSupply = circulatingSupply;
        this.marketCap = marketCap;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean testName(String name2)
    {
        return getName().equalsIgnoreCase(name2);
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol(String symbol)
    {
        this.symbol = symbol.toUpperCase();
    }

    public boolean testSymbol(String symbol2)
    {
        return getSymbol().equalsIgnoreCase(symbol2);
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean testDescription(String description2)
    {
        return getDescription().equalsIgnoreCase(description2);
    }

    public int getCirculatingSupply()
    {
        return circulatingSupply;
    }

    public void setCirculatingSupply(int circulatingSupply)
    {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean testCirculatingSupply(int circulatingSupply2)
    {
        return getCirculatingSupply() == circulatingSupply2;
    }

    public int getMarketCap()
    {
        return marketCap;
    }

    public void setMarketCap(int marketCap)
    {
        this.marketCap = marketCap;
    }

    public boolean testMarketCap(int marketCap2)
    {
        return getMarketCap() == marketCap2;
    }


    public double getPrice()
    {
        setPrice(getMarketCap(), getCirculatingSupply());
        return price;

    }

    public String divdingLine()
    {
        return "\n-----------------------------------------------------------------------------------\n\n";
    }

    private void setPrice(int marketCap, int circulatingSupply)
    {
        double mrkCap = (double)marketCap;
        double crcSup = (double)circulatingSupply;
        double price = mrkCap/crcSup;
        this.price =  price;
    }

    public boolean allDataSame(String name2, String symbol2, String description2, int circulatingSupply2, int marketCap2)
    {
        boolean sameName = testName(name2);
        boolean sameSymbol = testSymbol(symbol2);
        boolean sameDescription = testDescription(description2);
        boolean sameCirculatingSupply = testCirculatingSupply(circulatingSupply2);
        boolean sameMarketCap = testMarketCap(marketCap2);
        return sameName && sameSymbol && sameDescription && sameCirculatingSupply && sameMarketCap;
    }

    public String formatInstanceData()
    {
        String results = "";
        DecimalFormat formatter = new DecimalFormat("#0.00");
        results += "Name:\t\t\t\t"+getName()+"\n";
        results += "Symbol:\t\t\t\t"+getSymbol()+"\n";
        results += "Description:\t\t"+getDescription()+"\n";
        results += "Circulating Supply:\t"+getCirculatingSupply()+"\n";
        results += "Market Cap:\t\t\t"+getMarketCap()+"\n";
        results += "Price:\t\t\t\t"+formatter.format(getPrice())+"\n";
        return results;
    }




}

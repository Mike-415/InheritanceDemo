package Inheritance;

import java.util.Arrays;

public class CryptoCurrencyImplementer
{
    private static ProgrammableCoin getProgrammableCoin()
    {
        ProgrammableCoin programmableCoin = new ProgrammableCoin("AdaCoin");
        programmableCoin.setSymbol("ADA");
        programmableCoin.setDescription("Decentralized applications using block-chain technology");
        programmableCoin.setCirculatingSupply(1000055500);
        programmableCoin.setMarketCap(90000000000L);
        programmableCoin.setScript("if(coffeeLow())\n{\n\tgetJava();\n}");
        return programmableCoin;
    }

    private static AnonymousCoin getAnonymousCoin()
    {
        AnonymousCoin anonymousCoin = new AnonymousCoin("HushCoin");
        anonymousCoin.setSymbol("SHH");
        anonymousCoin.setDescription("Anonymous peer-to-peer transactions");
        anonymousCoin.setCirculatingSupply(200000);
        anonymousCoin.setMarketCap(999999999);
        return anonymousCoin;
    }

    private static LotteryCoin getLotteryCoin()
    {
        LotteryCoin lotteryCoin = new LotteryCoin("LuckyCoin");
        lotteryCoin.setSymbol("LCK");
        lotteryCoin.setDescription("An international, decentralized, open-source lottery system");
        lotteryCoin.setCirculatingSupply(887777);
        lotteryCoin.setMarketCap(99988888);
        lotteryCoin.setLuckyNumber(1234567);
        return lotteryCoin;
    }
    private static String arrToStr(CryptoCurrency[] cryptoArray)
    {
        String results = "";
        for(int i = 0; i < cryptoArray.length; i++)
        {
            //Used to vertically align the prices
            if(cryptoArray[i].getName().length() >8)
            {
                results += "\t-"+cryptoArray[i].getName()+": "+cryptoArray[i].getPrice()+"\n";
            }
            else
            {
                results += "\t-"+cryptoArray[i].getName()+": \t"+cryptoArray[i].getPrice()+"\n";
            }

        }
        return results;
    }

    private static void beforeAfterSorting(CryptoCurrency[] cryptoArray)
    {
        System.out.println("Before the sort:");
        System.out.println(arrToStr(cryptoArray));
        Arrays.sort(cryptoArray);
        System.out.println("After the sort:");
        System.out.println(arrToStr(cryptoArray));
    }

    public static void main(String[] args)
    {
        ProgrammableCoin programmableCoin = getProgrammableCoin();
        AnonymousCoin anonymousCoin = getAnonymousCoin();
        LotteryCoin lotteryCoin = getLotteryCoin();

        CryptoCurrency[] cryptoArray = { programmableCoin, anonymousCoin, lotteryCoin };

        System.out.println(CryptoCurrency.getDividingLine());
        for(CryptoCurrency coin : cryptoArray)
        {
            System.out.println(coin);
        }
        System.out.println("\nTotal market capitalization: "+CryptoCurrency.getTotalMarketCap()+"\n");
        beforeAfterSorting(cryptoArray);
        System.out.println(CryptoCurrency.getDividingLine());
    }
}


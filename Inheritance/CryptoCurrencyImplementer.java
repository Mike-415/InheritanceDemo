package Inheritance;

import java.util.ArrayList;


public class CryptoCurrencyImplementer
{
    private static ProgrammableCoin getProgrammableCoin()
    {
        ProgrammableCoin programmableCoin = new ProgrammableCoin("AdaCoin");
        programmableCoin.setSymbol("ADA");
        programmableCoin.setDescription("Decentralized applications using block-chain technology");
        programmableCoin.setCirculatingSupply(1000000);
        programmableCoin.setMarketCap(9000000);
        programmableCoin.setScript("if(coffeeLow())\n{\n\tgetJava();\n}");
        return programmableCoin;
    }

    private static AnonymousCoin getAnonymousCoin()
    {
        AnonymousCoin anonymousCoin = new AnonymousCoin("HushCoin");
        anonymousCoin.setSymbol("SHH");
        anonymousCoin.setDescription("Anonymous peer-to-peer transactions");
        anonymousCoin.setCirculatingSupply(200000);
        anonymousCoin.setMarketCap(9999999);
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

    public static void main(String[] args)
    {
        ArrayList<CryptoCurrency> coinList = new ArrayList<>();

        ProgrammableCoin programmableCoin = getProgrammableCoin();
        AnonymousCoin anonymousCoin = getAnonymousCoin();
        LotteryCoin lotteryCoin = getLotteryCoin();

        coinList.add(programmableCoin);
        coinList.add(anonymousCoin);
        coinList.add(lotteryCoin);

        System.out.println();
        for(CryptoCurrency coin : coinList)
        {
            System.out.println(coin);
        }

    }
}

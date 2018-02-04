package de.butterworks.cryptoenums;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import static de.butterworks.cryptoenums.Symbols.*;

public class FriendlySymbols {

    public static final Map<Symbols, String> symbolsMap = generateMap();

    private static Map<Symbols, String> generateMap() {

        return ImmutableMap.<Symbols, String>builder()
                .put(BTC, "BITCOIN")
                .put(ETH, "ETHEREUM")
                .put(XRP, "RIPPLE")
                .put(BCH, "BITCOIN CASH")
                .put(ADA, "CARDANO")
                .put(LTC, "LITECOIN")
                .put(XLM, "STELLAR")
                .put(NEO, "NEO")
                .put(EOS, "EOS")
                .put(XEM, "NEM")
                .put(MIOTA, "IOTA")
                .put(DASH, "DASH")
                .put(XMR, "MONERO")
                .put(TRX, "TRON")
                .put(LSK, "LISK")
                .put(VEN, "VECHAIN")
                .put(ETC, "ETHEREUM CLASSIC")
                .put(USDT, "TETHER")
                .put(QTUM, "QTUM")
                .put(PPT, "POPULOUS")
                .put(XRB, "NANO")
                .put(BTG, "BITCOIN GOLD")
                .put(ICX, "ICON")
                .put(OMG, "OMISEGO")
                .put(ZEC, "ZCASH")
                .put(STEEM, "STEEM")
                .put(BCN, "BYTEOIN")
                .put(BNB, "BINANCE COIN")
                .put(STRAT, "STRATIS")
                .put(XVG, "VERGE")
                .put(SC, "SIACOIN")
                .put(SNT, "STATUS")
                .put(BTS, "BITSHARES")
                .put(MKR, "MAKER")
                .put(DGD, "DIGIXDAO")
                .put(VERI, "VERITASEUM")
                .put(KCS, "KUCOIN SHARES")
                .put(WTC, "WALTON")
                .put(AE, "AETERNITY")
                .put(ZRX, "0X")
                .put(WAVES, "WAVES")
                .put(REP, "AUGUR")
                .put(RHOC, "RCHAIN")
                .put(DOGE, "DOGECOIN")
                .put(DCR, "DECRED")
                .put(ARDR, "ARDOR")
                .put(KNC, "KYBER NETWORK")
                .put(HSR, "HSHARE")
                .put(KMD, "KOMODO")
                .put(GAS, "GAS")
                .build();
    }
}

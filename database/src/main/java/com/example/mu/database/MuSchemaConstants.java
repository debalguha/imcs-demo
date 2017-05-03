package com.example.mu.database;

import org.apache.hadoop.hbase.util.Bytes;

/**
 * This interface contains all the constants defining the HBase schema
 * Created by oliver.salmon@gmail.com on 02/05/2017.
 */
public interface MuSchemaConstants {
    // HBASE connectivity
    public static final String HBASE_HOST = "138.68.147.208";
    public static final String ZK_HOST = "138.68.147.208";

    // TRADE Table
    public static final String TABLE_TRADE = "mu:trade";
    public static final String CF_TRADE_DETAILS = "td";
    public static final byte[]  TRADE_ID = Bytes.toBytes("tradeId")
    ,                           SECONDARY_TRADE_ID = Bytes.toBytes("secondaryTradeId")
    ,                           FIRM_TRADE_ID_FK = Bytes.toBytes("firmTradeId")
    ,                           SECONDARY_FIRM_TRADE_ID_FK  = Bytes.toBytes("secondaryFirmTradeId")
    ,                           TRADE_TYPE = Bytes.toBytes("tradeType")
    ,                           SECONDARY_TRADE_TYPE = Bytes.toBytes("secondaryTradeType")
    ,                           EXECUTION_ID = Bytes.toBytes("executionId")
    ,                           ORIGINAL_TRADE_DATE = Bytes.toBytes("originalTradeDate")
    ,                           EXECUTING_FIRM_ID_FK = Bytes.toBytes("executingFirmId")
    ,                           CLIENT_ID_FK = Bytes.toBytes("clientId")
    ,                           EXECUTION_VENUE_ID_FK = Bytes.toBytes("executionVenueId")
    ,                           EXECUTING_TRADER_ID_FK = Bytes.toBytes("executingTraderId")
    ,                           POSITION_ACCOUNT_ID_FK = Bytes.toBytes("positionAccountId")
    ,                           INSTRUMENT_ID_FK = Bytes.toBytes("instrumentId")
    ,                           TRADE_PRICE = Bytes.toBytes("price")
    ,                           QUANTITY = Bytes.toBytes("quantity")
    ,                           CURRENCY = Bytes.toBytes("currency")
    ,                           TRADE_DATE = Bytes.toBytes("tradeDate")
    ,                           SETTLEMENT_DATE = Bytes.toBytes("settlementDate");

    // PARTY Table
    public static final String TABLE_PARTY = "mu:party";
    public static final String CF_PARTY_DETAILS = "pd";
    public static final byte[]  PARTY_ID = Bytes.toBytes("partyId")
    ,                           SHORT_NAME = Bytes.toBytes("shortName")
    ,                           NAME = Bytes.toBytes("name")
    ,                           ROLE = Bytes.toBytes("role");

    // INSTRUMENT Table
    public static final String TABLE_INSTRUMENT = "mu:instrument";
    public static final String CF_INSTRUMENT_DETAILS = "id";
    public static final byte[]  INSTRUMENT_ID = Bytes.toBytes("instrumentId")
    ,                           SYMBOL = Bytes.toBytes("symbol")
    ,                           PRODUCT = Bytes.toBytes("product")
    ,                           ASSET_CLASS = Bytes.toBytes("assetClass")
    ,                           ISSUER = Bytes.toBytes("issuer");

    // INSTRUMENT Table
    public static final String TABLE_PRICE = "mu:price";
    public static final String CF_PRICE_DETAILS = "pxd";
    public static final byte[]  PRICE_ID = Bytes.toBytes("priceId")
    ,                           PRICE_INSTRUMENT_ID = Bytes.toBytes("instrumentId")
    ,                           PRICE = Bytes.toBytes("price")
    ,                           TIMESTAMP = Bytes.toBytes("timeStamp");




}
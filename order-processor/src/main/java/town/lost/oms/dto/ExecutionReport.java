/*
 * Copyright (c) 2016-2019 Chronicle Software Ltd
 */

package town.lost.oms.dto;

import net.openhft.chronicle.wire.Base32LongConverter;
import net.openhft.chronicle.wire.LongConversion;
import net.openhft.chronicle.wire.MicroTimestampLongConverter;

public class ExecutionReport extends AbstractEvent<ExecutionReport> {
    private String clOrdID = "";

    private String symbol = "";

    private BuySell side;

    @LongConversion(MicroTimestampLongConverter.class)
    private long transactTime;

    private double orderQty;

    private double price;

    @LongConversion(Base32LongConverter.class)
    private long orderID;

    private OrderType ordType;

    private double lastPx;

    private double leavesQty;

    private double cumQty;

    private double avgPx;

    private String text = null;

    public String clOrdID() {
        return clOrdID;
    }

    public ExecutionReport clOrdID(String clOrdID) {
        this.clOrdID = clOrdID;
        return this;
    }

    public String symbol() {
        return symbol;
    }

    public ExecutionReport symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public BuySell side() {
        return side;
    }

    public ExecutionReport side(BuySell side) {
        this.side = side;
        return this;
    }

    public long transactTime() {
        return transactTime;
    }

    public ExecutionReport transactTime(long transactTime) {
        this.transactTime = transactTime;
        return this;
    }

    public double orderQty() {
        return orderQty;
    }

    public ExecutionReport orderQty(double orderQty) {
        this.orderQty = orderQty;
        return this;
    }

    public double price() {
        return price;
    }

    public ExecutionReport price(double price) {
        this.price = price;
        return this;
    }

    public long orderID() {
        return orderID;
    }

    public ExecutionReport orderID(long orderID) {
        this.orderID = orderID;
        return this;
    }

    public OrderType ordType() {
        return ordType;
    }

    public ExecutionReport ordType(OrderType ordType) {
        this.ordType = ordType;
        return this;
    }

    public double lastPx() {
        return lastPx;
    }

    public ExecutionReport lastPx(double lastPx) {
        this.lastPx = lastPx;
        return this;
    }

    public double leavesQty() {
        return leavesQty;
    }

    public ExecutionReport leavesQty(double leavesQty) {
        this.leavesQty = leavesQty;
        return this;
    }

    public double cumQty() {
        return cumQty;
    }

    public ExecutionReport cumQty(double cumQty) {
        this.cumQty = cumQty;
        return this;
    }

    public double avgPx() {
        return avgPx;
    }

    public ExecutionReport avgPx(double avgPx) {
        this.avgPx = avgPx;
        return this;
    }

    public String text() {
        return text;
    }

    public ExecutionReport text(String text) {
        this.text = text;
        return this;
    }
}

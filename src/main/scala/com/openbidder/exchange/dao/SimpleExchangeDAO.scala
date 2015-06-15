package com.openbidder.exchange.dao

import com.openbidder.exchange.{PixelServiceConnection, BidderConnection}
import com.openbidder.model.com.openbidder.exchange.PixelServiceConnection

class SimpleExchangeDAO extends ExchangeDAO {
  override def bidders: Seq[BidderConnection] = ???

  override def pixelService(bidderId: Int): PixelServiceConnection = ???
}

package com.openbidder.exchange.dao

import com.openbidder.exchange.{PixelServiceConnection, BidderConnection}
import com.openbidder.model.com.openbidder.exchange.PixelServiceConnection

trait ExchangeDAO {
  def bidders: Seq[BidderConnection]
  def pixelService(bidderId: Int): PixelServiceConnection
}

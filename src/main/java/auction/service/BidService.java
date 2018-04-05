package auction.service;

import auction.domain.Bid;
import auction.domain.Lot;
import auction.domain.User;

public interface BidService {

    Bid makeBid(Bid bid, User user, Lot lot);
}

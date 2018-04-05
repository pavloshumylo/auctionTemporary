package auction.service;

import auction.domain.Bid;
import auction.domain.Lot;
import auction.domain.User;
import auction.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {

    @Autowired
    private BidRepository bidRepository;

    public Bid makeBid(Bid bid, User user, Lot lot) {
        Bid bid1 = bidRepository.save(bid);
        user.getBids().add(bid);
        lot.getBids().add(bid);
        return bid1;
    }
}

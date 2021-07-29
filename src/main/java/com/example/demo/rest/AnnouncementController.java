package com.example.demo.rest;

import com.example.demo.entities.Advert;
import com.example.demo.entities.Bid;
import com.example.demo.entities.Category;
import com.example.demo.entities.Users;
import com.example.demo.entities.helpers.AdvertRequest;
import com.example.demo.entities.helpers.BidRequest;
import com.example.demo.services.AdvertService;
import com.example.demo.services.BidService;
import com.example.demo.services.CategoryService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class AnnouncementController {
    @Autowired
    private AdvertService advertService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BidService bidService;

    @Autowired
    private UserService userService;

//    @GetMapping(value = "/announcementsby")
//    public List<Advert> getCardsByCategory(@RequestParam("id") Long categoryId){
//        System.out.println("IT IS BY CATEGORY ID");
//        System.out.println(categoryId + " CATEGORY ID");
//        Category category = categoryService.getCategory(categoryId);
//        System.out.println(category.getName() + " +");
//        List<Advert> advertList = advertService.getAdvertsByCategoryId(categoryId);
//        System.out.println(advertList.size() + "  - ADVERTS LIST SIZE");
//        System.out.println("===1===");
//        for(int i=0; i<advertList.size(); i++){
//            System.out.println(advertList.get(i).getName() + " ()()");
//        }
//        System.out.println("===2===");
//        return advertList;
//    }

    @GetMapping(value = "/announcementsby/{id}")
    public ResponseEntity<?> getCardsByCategory(@PathVariable("id") Long id){;
        List<Advert> advertList = advertService.getAllAdverts();

        List<Advert> adverts = new ArrayList<>();
        for(int i=0; i<advertList.size(); i++){
            if(advertList.get(i).getCategory().getId() == id){
                adverts.add(advertList.get(i));
            }
        }

        System.out.println(adverts.size() + "  - ADVERTS LIST SIZE");
        return new ResponseEntity<>(adverts, HttpStatus.OK);
    }

    @GetMapping(value = "/getannouncement/{id}")
    public ResponseEntity<?> getAdvert(@PathVariable("id") Long id){
        System.out.println(id + " ID GET");
        List<Advert> advertList = advertService.getAllAdverts();
        Advert advert = new Advert();
        for(int i=0; i<advertList.size(); i++){
            if(advertList.get(i).getId() == id){
                advert = advertList.get(i);
            }
        }
//        Advert advert = advertService.getAdvert(id);
        System.out.println(advert.getName() + " {}");
        return new ResponseEntity<>(advert, HttpStatus.OK);
    }

    @GetMapping(value = "/allannouncements")
    public ResponseEntity<?> getAllAdverts(){
        System.out.println("IT IS ALL ADVERTS");
        List<Advert> advertList = advertService.getAllAdverts();
        System.out.println("======1=====");
//        List<Advert> advertList = advertService.getAllAdverts();
        for(int i=0; i<advertList.size(); i++){
            System.out.println(advertList.get(i).getName() + " ()()");
        }
        System.out.println("======2=====");
        System.out.println(advertList.size() + "  - ADVERTS LIST SIZE");
        return new ResponseEntity<>(advertList, HttpStatus.OK);
    }

    @PostMapping(value = "/addannouncement")
    public void addAnnouncement(@RequestBody AdvertRequest advertRequest){
        System.out.println("HIHIHIHIHI");
        Category category = categoryService.getCategory(advertRequest.getCategory());
        Advert advert = new Advert();
        advert.setName(advertRequest.getName());
        advert.setDesrciption(advertRequest.getDescription());
        advert.setCompany(advertRequest.getCompany());
        advert.setPrice(advertRequest.getPrice());
        advert.setImg(advertRequest.getImg());
        advert.setCategory(category);
        advertService.addAdvert(advert);
    }

    @PostMapping(value = "/submit/{id}")
    public void AddBid(@PathVariable("id") Long id,
                       @RequestBody BidRequest bidRequest){
        System.out.println(id + " &&&&&&&");
        System.out.println(bidRequest.getSuggestion());
        Bid bid = new Bid();
        bid.setSuggestion(bidRequest.getSuggestion());
        bid.setPrice(bidRequest.getPrice());
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        bid.setCreatedDate(date);
        Advert advert = advertService.getAdvert(id);
        bid.setAdverts(advert);
        Users user = userService.getUser(1L);
        bid.setUser(user);
        bidService.createBid(bid);
    }

    @PostMapping(value = "/deleteadvert")
    public void DeleteAdvert(@RequestBody Advert advert){
        System.out.println(advert.getName() + " DELETE ID");
        advertService.deleteAdvert(advert.getId());
    }

    @GetMapping(value = "/bids/{id}")
    public ResponseEntity<?> getBidsByAdvertId(@PathVariable("id") Long id){
        List<Bid> allBids = bidService.getAllBids();
        List<Bid> bids = new ArrayList<>();
        for(int i=0; i<allBids.size(); i++){
            if(allBids.get(i).getAdverts().getId() == id){
                bids.add(allBids.get(i));
            }
        }
        System.out.println("BIDS NORM");
        return ResponseEntity.ok(bids);
    }
}

package com.example.demo.rest;

import com.example.demo.entities.Advert;
import com.example.demo.entities.Category;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin("*")
//@RequestMapping(value = "/api")
public class MainRestController {

    @Autowired
    private UserService userService;

    @Autowired
    private RolesService rolesService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BidService bidService;

    @Autowired
    private AdvertService advertService;

    @Autowired
    private WinnerService winnerService;

//    @PostMapping("/register")
//    public Users registerUser(@RequestBody UserRequest userRequest){
//        System.out.println("QWERTYUIOP 1");
//        Users checkUser = userService.findByEmail(userRequest.getEmail());
//        if(checkUser == null){
//            System.out.println("QWERTYUIOP 2");
//            Roles role = rolesService.getRole("ROLE_USER");
//            System.out.println(role.getRole());
//            if(role != null && userRequest.getPassword().equals(userRequest.getRe_password())){
//                System.out.println("QWERTYUIOP 3");
//                ArrayList<Roles> roles = new ArrayList<>();
//                roles.add(role);
//                Users user = new Users();
//                user.setFullName(userRequest.getFull_name());
//                user.setEmail(userRequest.getEmail());
//                user.setRoles(roles);
//                user.setPassword(bCryptPasswordEncoder.encode(userRequest.getPassword()));
//                return userService.saveUser(user);
//            }
//        }
//        return null;
//    }

    @GetMapping(value = "/getcategories")
    public ResponseEntity<?> getAllCategories(){
        List<Category> categoryList = categoryService.getAllCategories();
//        for(int i=0; i<categoryList.size(); i++){
//            System.out.println(categoryList.get(i).getName() + " @");
//        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }


//    @GetMapping(value = "/announcementsby/{id}")
//    public ResponseEntity<?> getCardsByCategory(@PathVariable("id") Long id){
//        System.out.println("IT IS BY CATEGORY ID");
//        System.out.println(id + " CATEGORY ID");
//        Category category = categoryService.getCategory(id);
//        System.out.println(category.getName() + " +");
//        List<Advert> advertList = advertService.getAdvertsByCategoryId(id);
//        System.out.println("======1=====");
////        List<Advert> advertList = advertService.getAllAdverts();
//        for(int i=0; i<advertList.size(); i++){
//            System.out.println(advertList.get(i).getName() + " ()()");
//        }
//        System.out.println("======2=====");
//        System.out.println(advertList.size() + "  - ADVERTS LIST SIZE");
//        return new ResponseEntity<>(advertList, HttpStatus.OK);
//    }
//    @GetMapping(value = "/bids")
//    public ResponseEntity<?> getALlBids(){
//        List<Bid> bids = bidService.getAllBids();
//        return new ResponseEntity<>(bids, HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/createbid")
//    public Bid createBid(@RequestParam("advertId") Long advertId,
//                                       @RequestBody Bid newBid){
//        Users user = getUser();
//        newBid.setUser(user);
//        newBid.setAdverts(advertService.getAdvert(advertId));
//        return bidService.createBid(newBid);
//    }
//
//    @PostMapping(value = "/nominatewinner")
//    public Winners nominateWinner(@RequestParam("advertId") Long advertId,
//                                  @RequestParam("bidId") Long bidId){
//        Advert advert = advertService.getAdvert(advertId);
//        Bid bid = bidService.getBid(bidId);
//        Winners winners = new Winners();
//        winners.setFinished(false);
//        winners.setAdvert(advert);
//        winners.setBid(bid);
//        winners.setUser(bid.getUser());
//        return winnerService.addWinner(winners);
//    }
//
//    @GetMapping(value = "/profile")
//    public ResponseEntity<?> profilePage(){
//        Users user = getUser();
//        return new ResponseEntity<>(new UserDTO(user.getId(), user.getEmail()), HttpStatus.OK);
//    }
//
//    private Users getUser(){
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if(!(authentication instanceof AnonymousAuthenticationToken)){
//            Users user = (Users) authentication.getPrincipal();
//            System.out.println("I WAS HERE1");
//            return user;
//        }
//        System.out.println("I WAS HERE RETURN NULL");
//        return null;
//    }
}

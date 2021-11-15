package net.ets.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ets.model.MyEtsBanner;
import net.ets.modelView.MyEtsBannerViewModel;
import net.ets.service.MyEtsBannerService;

@RestController
@CrossOrigin
public class MyEtsBannerController {

	private MyEtsBannerService bannerService;

	public MyEtsBannerController(MyEtsBannerService bannerService) {
		this.bannerService = bannerService;
	}
	
	@RequestMapping(value = "/add-banner" , method = RequestMethod.POST)
	public ResponseEntity<Void> saveBanner(@ModelAttribute MyEtsBannerViewModel bannerViewModel ){
		bannerService.saveMyEtsBanner(bannerViewModel);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	@RequestMapping(value = "/banners" , method = RequestMethod.GET)
	public ResponseEntity<List<MyEtsBanner>> getAllBannerData(){
		return new ResponseEntity<>(bannerService.getBannerData(),HttpStatus.OK);
	}
	
	
	
}

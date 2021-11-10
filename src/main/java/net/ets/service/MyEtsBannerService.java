package net.ets.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import net.ets.model.MyEtsBanner;
import net.ets.modelView.MyEtsBannerViewModel;
import net.ets.repository.MyEtsBannerRepository;

@Service
public class MyEtsBannerService {

	private MyEtsBannerRepository bannerRepo;

	public MyEtsBannerService(MyEtsBannerRepository bannerRepository) {
		this.bannerRepo = bannerRepository;
	}
	
	
	public void saveMyEtsBanner(MyEtsBannerViewModel banner) {
		
			bannerRepo.save(covertMyEtsBannerToViewModel(banner));
	}
	
	private MyEtsBanner covertMyEtsBannerToViewModel(MyEtsBannerViewModel model) {
		
		MyEtsBanner bannerEntity =new MyEtsBanner();
		try {
			bannerEntity.setBannerImgAr(model.getBannerImgAr().getBytes());
			bannerEntity.setBannerId(model.getBannerId());
			bannerEntity.setBannerImgEn(model.getBannerImgEn().getBytes());
			bannerEntity.setMinType(model.getMinType());
			bannerEntity.setShortCode(model.getShortCode());
			bannerEntity.setMinAppVersion(model.getMinAppVersion());
			bannerEntity.setSegment(model.getSegment());
			bannerEntity.setScreenId(model.getScreenId());
			bannerEntity.setImgLink(model.getImgLink());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return bannerEntity;
		
	}
	
	
	
	
	
}

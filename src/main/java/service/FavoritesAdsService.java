package service;

import models.BlockShortAdModel;
import pages.favoritesAds.FavoritesAdsPage;
import pages.realEstate.elements.BlockShortAd;

import javax.annotation.Nullable;
import java.util.List;

public class FavoritesAdsService extends BaseService {
    private final FavoritesAdsPage favoritesAdsPage;

    public FavoritesAdsService() {
        this.favoritesAdsPage = new FavoritesAdsPage();
    }

    public boolean isCheckAds(List<BlockShortAdModel> models) {
        return models.stream().allMatch(model -> getShortAd(model) != null);
    }

    @Nullable
    private BlockShortAd getShortAd(BlockShortAdModel model) {
        return favoritesAdsPage.getListFavoritesAds().stream().filter(blockShortAd -> blockShortAd.getTitleAd().getText().equals(model.getTitle())
                && blockShortAd.getDescription().getText().equals(model.getDescription())
                && blockShortAd.getEdcPrice().getPrice().equals(model.getPrice())
                && blockShortAd.getCity().getText().equals(model.getCity())
                && blockShortAd.getSubtitle().getText().equals(model.getSubtitle())).findFirst().orElse(null);
    }

}

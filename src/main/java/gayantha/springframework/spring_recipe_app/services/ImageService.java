package gayantha.springframework.spring_recipe_app.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    void saveImageFile(Long reipeId, MultipartFile file);
}

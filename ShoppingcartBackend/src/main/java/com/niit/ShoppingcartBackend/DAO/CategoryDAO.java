package com.niit.ShoppingcartBackend.DAO;
import java.util.List;

import com.niit.ShoppingcartBackend.Model.Category;
public interface CategoryDAO {
public List<Category> list();
public Category getBycategoryId(String categoryId);
public Category getBycategoryName(String categoryname);
public Category getBycategoryDescription(String categoryDescription);


}

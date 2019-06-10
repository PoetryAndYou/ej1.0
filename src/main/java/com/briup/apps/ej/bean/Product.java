package com.briup.apps.ej.bean;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_product.id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_product.name
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_product.description
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_product.price
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_product.status
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_product.photo
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private String photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_product.category_id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private Long categoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_product.id
     *
     * @return the value of ej_product.id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_product.id
     *
     * @param id the value for ej_product.id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_product.name
     *
     * @return the value of ej_product.name
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_product.name
     *
     * @param name the value for ej_product.name
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_product.description
     *
     * @return the value of ej_product.description
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_product.description
     *
     * @param description the value for ej_product.description
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_product.price
     *
     * @return the value of ej_product.price
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_product.price
     *
     * @param price the value for ej_product.price
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_product.status
     *
     * @return the value of ej_product.status
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_product.status
     *
     * @param status the value for ej_product.status
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_product.photo
     *
     * @return the value of ej_product.photo
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_product.photo
     *
     * @param photo the value for ej_product.photo
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_product.category_id
     *
     * @return the value of ej_product.category_id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_product.category_id
     *
     * @param categoryId the value for ej_product.category_id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
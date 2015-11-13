// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.ecommerce.proto;

public interface InventoryProductOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // required uint64 id = 1;
  /**
   * <code>required uint64 id = 1;</code>
   */
  boolean hasId();
  /**
   * <code>required uint64 id = 1;</code>
   */
  long getId();

  // required string name = 2;
  /**
   * <code>required string name = 2;</code>
   */
  boolean hasName();
  /**
   * <code>required string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>required string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  // required .Brand brand = 3;
  /**
   * <code>required .Brand brand = 3;</code>
   */
  boolean hasBrand();
  /**
   * <code>required .Brand brand = 3;</code>
   */
  com.ecommerce.proto.Brand getBrand();
  /**
   * <code>required .Brand brand = 3;</code>
   */
  com.ecommerce.proto.BrandOrBuilder getBrandOrBuilder();

  // required .Category category = 4;
  /**
   * <code>required .Category category = 4;</code>
   */
  boolean hasCategory();
  /**
   * <code>required .Category category = 4;</code>
   */
  com.ecommerce.proto.Category getCategory();
  /**
   * <code>required .Category category = 4;</code>
   */
  com.ecommerce.proto.CategoryOrBuilder getCategoryOrBuilder();

  // optional string color = 5;
  /**
   * <code>optional string color = 5;</code>
   */
  boolean hasColor();
  /**
   * <code>optional string color = 5;</code>
   */
  java.lang.String getColor();
  /**
   * <code>optional string color = 5;</code>
   */
  com.google.protobuf.ByteString
      getColorBytes();

  // required uint64 sell_rate = 6;
  /**
   * <code>required uint64 sell_rate = 6;</code>
   */
  boolean hasSellRate();
  /**
   * <code>required uint64 sell_rate = 6;</code>
   */
  long getSellRate();

  // required uint64 net_rate = 7;
  /**
   * <code>required uint64 net_rate = 7;</code>
   */
  boolean hasNetRate();
  /**
   * <code>required uint64 net_rate = 7;</code>
   */
  long getNetRate();

  // required uint32 quantity = 8;
  /**
   * <code>required uint32 quantity = 8;</code>
   */
  boolean hasQuantity();
  /**
   * <code>required uint32 quantity = 8;</code>
   */
  int getQuantity();

  // optional string description = 9;
  /**
   * <code>optional string description = 9;</code>
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 9;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 9;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  // optional string imgUrl = 10;
  /**
   * <code>optional string imgUrl = 10;</code>
   */
  boolean hasImgUrl();
  /**
   * <code>optional string imgUrl = 10;</code>
   */
  java.lang.String getImgUrl();
  /**
   * <code>optional string imgUrl = 10;</code>
   */
  com.google.protobuf.ByteString
      getImgUrlBytes();

  // repeated string imageUrls = 11;
  /**
   * <code>repeated string imageUrls = 11;</code>
   */
  java.util.List<java.lang.String>
  getImageUrlsList();
  /**
   * <code>repeated string imageUrls = 11;</code>
   */
  int getImageUrlsCount();
  /**
   * <code>repeated string imageUrls = 11;</code>
   */
  java.lang.String getImageUrls(int index);
  /**
   * <code>repeated string imageUrls = 11;</code>
   */
  com.google.protobuf.ByteString
      getImageUrlsBytes(int index);

  // repeated .InventoryProduct recommendations = 12;
  /**
   * <code>repeated .InventoryProduct recommendations = 12;</code>
   */
  java.util.List<com.ecommerce.proto.InventoryProduct> 
      getRecommendationsList();
  /**
   * <code>repeated .InventoryProduct recommendations = 12;</code>
   */
  com.ecommerce.proto.InventoryProduct getRecommendations(int index);
  /**
   * <code>repeated .InventoryProduct recommendations = 12;</code>
   */
  int getRecommendationsCount();
  /**
   * <code>repeated .InventoryProduct recommendations = 12;</code>
   */
  java.util.List<? extends com.ecommerce.proto.InventoryProductOrBuilder> 
      getRecommendationsOrBuilderList();
  /**
   * <code>repeated .InventoryProduct recommendations = 12;</code>
   */
  com.ecommerce.proto.InventoryProductOrBuilder getRecommendationsOrBuilder(
      int index);
}

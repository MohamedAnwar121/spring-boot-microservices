// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Schema.proto

// Protobuf Java Version: 3.25.3
package org.example;

public final class Schema {
  private Schema() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_Movie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_Movie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_Movies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_Movies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_TopMovieIds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_TopMovieIds_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Schema.proto\022\013org.example\032\033google/prot" +
      "obuf/empty.proto\";\n\005Movie\022\017\n\007movieId\030\001 \001" +
      "(\t\022\014\n\004name\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\",\n" +
      "\006Movies\022\"\n\006movies\030\001 \003(\0132\022.org.example.Mo" +
      "vie\"\036\n\013TopMovieIds\022\017\n\007movieId\030\001 \003(\t2Z\n\016T" +
      "rendingMovies\022H\n\027getTopTenTrendingMovies" +
      "\022\026.google.protobuf.Empty\032\023.org.example.M" +
      "ovies\"\0002k\n\024TrendingMoviesRating\022S\n\035getTo" +
      "pTenTrendingMoviesRating\022\026.google.protob" +
      "uf.Empty\032\030.org.example.TopMovieIds\"\0002d\n\022" +
      "TrendingMoviesInfo\022N\n\033getTopTenTrendingM" +
      "oviesInfo\022\030.org.example.TopMovieIds\032\023.or" +
      "g.example.Movies\"\000B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_org_example_Movie_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_Movie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_Movie_descriptor,
        new java.lang.String[] { "MovieId", "Name", "Description", });
    internal_static_org_example_Movies_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_Movies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_Movies_descriptor,
        new java.lang.String[] { "Movies", });
    internal_static_org_example_TopMovieIds_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_example_TopMovieIds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_TopMovieIds_descriptor,
        new java.lang.String[] { "MovieId", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

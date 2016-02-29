sbt-coffeescript
================

[![Build Status](https://api.travis-ci.org/sbt/sbt-coffeescript.png?branch=master)](https://travis-ci.org/sbt/sbt-coffeescript)

An SBT plugin to compile [CoffeeScript](http://coffeescript.org/) sources to JavaScript.

**This is unofficial fork with update dependencies libraries.**

To use this plugin use the addSbtPlugin command within your project's `plugins.sbt` file:

    resolvers += Resolver.url("sbt-catap-plugin-releases",
      url("http://dl.bintray.com/catap/sbt-plugins/"))(Resolver.ivyStylePatterns)

    addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.1")

Your project's build file also needs to enable sbt-web plugins. For example with build.sbt:

    lazy val root = (project in file(".")).enablePlugins(SbtWeb)

Once configured, any `*.coffee` or `*.litcoffee` files placed in `src/main/assets` will be compiled to JavaScript code in `target/web/public`.

Supported settings:

* `sourceMap` When set, generates sourceMap files. Defaults to `true`.

  `CoffeeScriptKeys.sourceMap := true`

* `bare` When set, generates JavaScript without the [top-level function safety wrapper](http://coffeescript.org/#lexical-scope). Defaults to `false`.

  `CoffeeScriptKeys.bare := false`

The plugin is built on top of [JavaScript Engine](https://github.com/typesafehub/js-engine) which supports different JavaScript runtimes.

&copy; Typesafe Inc., 2013, 2014

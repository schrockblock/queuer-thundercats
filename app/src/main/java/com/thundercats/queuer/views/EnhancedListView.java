


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>EnhancedListView/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java at develop · schrockblock/EnhancedListView</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <link rel="logo" type="image/svg" href="https://github-media-downloads.s3.amazonaws.com/github-logo.svg" />
    <meta property="og:image" content="https://github.global.ssl.fastly.net/images/modules/logos_page/Octocat.png">
    <meta name="hostname" content="github-fe119-cp1-prd.iad.github.net">
    <meta name="ruby" content="ruby 1.9.3p194-tcs-github-tcmalloc (a846054d10) [x86_64-linux]">
    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />
    


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="89A54B0E:06EE:8C4B123:52CD98FD" name="octolytics-dimension-request_id" /><meta content="5129994" name="octolytics-actor-id" /><meta content="kevinchen93" name="octolytics-actor-login" /><meta content="32ff28edad723d988ba230fb14fb22f90c06a8f69a00653d065d8519d48e3779" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="R9xefCNz954VGyTPh9otgVM+Ez+YOabpo79cq9ToulI=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-97a08d0c62ded290cae46fd72fc0a38c835777a6.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-e9fa70a28908749635706b3edcc1dad6bfaa378c.css" media="all" rel="stylesheet" type="text/css" />
    

    

      <script src="https://github.global.ssl.fastly.net/assets/frameworks-7d67be4fc516c4502a4685bd4c55f014cca4eb36.js" type="text/javascript"></script>
      <script src="https://github.global.ssl.fastly.net/assets/github-a31c5b367955deef4f0ee1d5b5e90e9edfc7fba5.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="874518d40f47c7b1792d9c24a93a503b">

        <link data-pjax-transient rel='permalink' href='/schrockblock/EnhancedListView/blob/af13c7ebd01b9f90a9c0cbe303fc7184befbaab5/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java'>
  <meta property="og:title" content="EnhancedListView"/>
  <meta property="og:type" content="githubog:gitrepository"/>
  <meta property="og:url" content="https://github.com/schrockblock/EnhancedListView"/>
  <meta property="og:image" content="https://github.global.ssl.fastly.net/images/gravatars/gravatar-user-420.png"/>
  <meta property="og:site_name" content="GitHub"/>
  <meta property="og:description" content="EnhancedListView - An Android ListView with enhanced functionality (e.g. Swipe To Dismiss or Undo)"/>

  <meta name="description" content="EnhancedListView - An Android ListView with enhanced functionality (e.g. Swipe To Dismiss or Undo)" />

  <meta content="2800975" name="octolytics-dimension-user_id" /><meta content="schrockblock" name="octolytics-dimension-user_login" /><meta content="15394898" name="octolytics-dimension-repository_id" /><meta content="schrockblock/EnhancedListView" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="true" name="octolytics-dimension-repository_is_fork" /><meta content="12471853" name="octolytics-dimension-repository_parent_id" /><meta content="timroes/EnhancedListView" name="octolytics-dimension-repository_parent_nwo" /><meta content="12471853" name="octolytics-dimension-repository_network_root_id" /><meta content="timroes/EnhancedListView" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/schrockblock/EnhancedListView/commits/develop.atom" rel="alternate" title="Recent Commits to EnhancedListView:develop" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production macintosh vis-public fork page-blob">
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/">
  <span class="mega-octicon octicon-mark-github"></span>
</a>

    
    <a href="/notifications" class="notification-indicator tooltipped downwards" data-gotokey="n" title="You have no unread notifications">
        <span class="mail-status all-read"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<input type="text" data-hotkey=" s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="kevinchen93"
      data-repo="schrockblock/EnhancedListView"
      data-branch="develop"
      data-sha="76456e9ae1bcd283aec841eff04ff93a4782e1b0"
  >

    <input type="hidden" name="nwo" value="schrockblock/EnhancedListView" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="octicon help tooltipped downwards" title="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/kevinchen93" class="name">
        <img height="20" src="https://0.gravatar.com/avatar/bf76c43c7f778ae5aa2299984e071794?d=https%3A%2F%2Fidenticons.github.com%2Ffec6efdda40a85b21faa1fe9c783bc73.png&amp;r=x&amp;s=140" width="20" /> kevinchen93
      </a>
    </li>

      <li class="new-menu dropdown-toggle js-menu-container">
        <a href="#" class="js-menu-target" class="tooltipped downwards" title="New repo, org, etc">
          <span class="octicon octicon-plus"></span>
          <span class="dropdown-arrow"></span>
        </a>

        <div class="js-menu-content">
        </div>
      </li>

      <li>
        <a href="/settings/profile" id="account_settings"
          class="tooltipped downwards"
          aria-label="Account settings "
          title="Account settings ">
          <span class="octicon octicon-tools"></span>
        </a>
      </li>
      <li>
        <a class="tooltipped downwards" href="/logout" data-method="post" id="logout" title="Sign out" aria-label="Sign out">
          <span class="octicon octicon-log-out"></span>
        </a>
      </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo-create"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>



</ul>

</div>


    
  </div>
</div>

      

      




          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="R9xefCNz954VGyTPh9otgVM+Ez+YOabpo79cq9ToulI=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="15394898" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/schrockblock/EnhancedListView/watchers">
        1
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0">
        <span class="js-select-button">
          <span class="octicon octicon-eye-watch"></span>
          Watch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-watch"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
  

  <div class="js-toggler-container js-social-container starring-container ">
    <a href="/schrockblock/EnhancedListView/unstar"
      class="minibutton with-count js-toggler-target star-button starred upwards"
      title="Unstar this repository" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star-delete"></span><span class="text">Unstar</span>
    </a>

    <a href="/schrockblock/EnhancedListView/star"
      class="minibutton with-count js-toggler-target star-button unstarred upwards"
      title="Star this repository" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star"></span><span class="text">Star</span>
    </a>

      <a class="social-count js-social-count" href="/schrockblock/EnhancedListView/stargazers">
        0
      </a>
  </div>

  </li>


        <li>
          <a href="/schrockblock/EnhancedListView/fork" class="minibutton with-count js-toggler-target fork-button lighter upwards" title="Fork this repo" rel="nofollow" data-method="post">
            <span class="octicon octicon-git-branch-create"></span><span class="text">Fork</span>
          </a>
          <a href="/schrockblock/EnhancedListView/network" class="social-count">27</a>
        </li>


</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo-forked"></span>
          <span class="author">
            <a href="/schrockblock" class="url fn" itemprop="url" rel="author"><span itemprop="title">schrockblock</span></a>
          </span>
          <span class="repohead-name-divider">/</span>
          <strong><a href="/schrockblock/EnhancedListView" class="js-current-repository js-repo-home-link">EnhancedListView</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

            <span class="fork-flag">
              <span class="text">forked from <a href="/timroes/EnhancedListView">timroes/EnhancedListView</a></span>
            </span>
        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      

      <div class="repository-with-sidebar repo-container  ">

        <div class="repository-sidebar">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped leftwards" title="Code">
        <a href="/schrockblock/EnhancedListView" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-gotokey="c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /schrockblock/EnhancedListView">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


      <li class="tooltipped leftwards" title="Pull Requests">
        <a href="/schrockblock/EnhancedListView/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="p" data-selected-links="repo_pulls /schrockblock/EnhancedListView/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped leftwards" title="Wiki">
          <a href="/schrockblock/EnhancedListView/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_wiki /schrockblock/EnhancedListView/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped leftwards" title="Pulse">
        <a href="/schrockblock/EnhancedListView/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /schrockblock/EnhancedListView/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped leftwards" title="Graphs">
        <a href="/schrockblock/EnhancedListView/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /schrockblock/EnhancedListView/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped leftwards" title="Network">
        <a href="/schrockblock/EnhancedListView/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /schrockblock/EnhancedListView/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

            <div class="only-with-full-nav">
              

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/schrockblock/EnhancedListView.git" readonly="readonly">

    <span class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/schrockblock/EnhancedListView.git" data-copied-hint="copied!" title="copy to clipboard"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:schrockblock/EnhancedListView.git" readonly="readonly">

    <span class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="git@github.com:schrockblock/EnhancedListView.git" data-copied-hint="copied!" title="copy to clipboard"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/schrockblock/EnhancedListView" readonly="readonly">

    <span class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/schrockblock/EnhancedListView" data-copied-hint="copied!" title="copy to clipboard"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="octicon help tooltipped upwards" title="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>

  <a href="http://mac.github.com" data-url="github-mac://openRepo/https://github.com/schrockblock/EnhancedListView" class="minibutton sidebar-button js-conduit-rewrite-url">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>


              <a href="/schrockblock/EnhancedListView/archive/develop.zip"
                 class="minibutton sidebar-button"
                 title="Download this repository as a zip file"
                 rel="nofollow">
                <span class="octicon octicon-cloud-download"></span>
                Download ZIP
              </a>
            </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:8a222d8af5a33d8eb6205e6dea2a1f3d -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/schrockblock/EnhancedListView/find/develop" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="develop"
    data-ref="develop"
    role="button" aria-label="Switch branches or tags" tabindex="0">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">develop</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax>

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/schrockblock/EnhancedListView/blob/develop/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java"
                 data-name="develop"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="develop">develop</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/schrockblock/EnhancedListView/blob/master/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/schrockblock/EnhancedListView/tree/v0.1.3/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java"
                 data-name="v0.1.3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v0.1.3">v0.1.3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/schrockblock/EnhancedListView/tree/v0.1.2/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java"
                 data-name="v0.1.2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v0.1.2">v0.1.2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/schrockblock/EnhancedListView/tree/v0.1.1/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java"
                 data-name="v0.1.1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v0.1.1">v0.1.1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/schrockblock/EnhancedListView/tree/v0.1.0/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java"
                 data-name="v0.1.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v0.1.0">v0.1.0</a>
            </div> <!-- /.select-menu-item -->
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schrockblock/EnhancedListView" data-branch="develop" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">EnhancedListView</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schrockblock/EnhancedListView/tree/develop/EnhancedListView" data-branch="develop" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">EnhancedListView</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schrockblock/EnhancedListView/tree/develop/EnhancedListView/src" data-branch="develop" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schrockblock/EnhancedListView/tree/develop/EnhancedListView/src/main" data-branch="develop" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">main</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schrockblock/EnhancedListView/tree/develop/EnhancedListView/src/main/java" data-branch="develop" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">java</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schrockblock/EnhancedListView/tree/develop/EnhancedListView/src/main/java/de" data-branch="develop" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">de</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schrockblock/EnhancedListView/tree/develop/EnhancedListView/src/main/java/de/timroes" data-branch="develop" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">timroes</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schrockblock/EnhancedListView/tree/develop/EnhancedListView/src/main/java/de/timroes/android" data-branch="develop" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">android</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/schrockblock/EnhancedListView/tree/develop/EnhancedListView/src/main/java/de/timroes/android/listview" data-branch="develop" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">listview</span></a></span><span class="separator"> / </span><strong class="final-path">EnhancedListView.java</strong> <span class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java" data-copied-hint="copied!" title="copy to clipboard"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>



  <div class="commit file-history-tease">
    <img class="main-avatar" height="24" src="https://1.gravatar.com/avatar/c3220c41e243d237e84cfb13f2498c90?d=https%3A%2F%2Fa248.e.akamai.net%2Fassets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png&amp;r=x&amp;s=140" width="24" />
    <span class="author"><span rel="author">Elliot Schrock</span></span>
    <time class="js-relative-date" datetime="2013-12-27T18:32:21-08:00" title="2013-12-27 18:32:21">December 27, 2013</time>
    <div class="commit-title">
        <a href="/schrockblock/EnhancedListView/commit/28d78f55ba4d6c687d86e2f8f1b60348e3053e7f" class="message" data-pjax="true" title="added rearrangement listener">added rearrangement listener</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>2</strong> contributors</a></p>
          <a class="avatar tooltipped downwards" title="timroes" href="/schrockblock/EnhancedListView/commits/develop/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java?author=timroes"><img height="20" src="https://1.gravatar.com/avatar/c137530174721ead03151eb9f1fa2aa2?d=https%3A%2F%2Fidenticons.github.com%2F93a6b06568690c5dc1ee2d1df538b03a.png&amp;r=x&amp;s=140" width="20" /></a>
    <a class="avatar tooltipped downwards" title="cketti" href="/schrockblock/EnhancedListView/commits/develop/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java?author=cketti"><img height="20" src="https://1.gravatar.com/avatar/19f33af017093834caecee97856322e6?d=https%3A%2F%2Fidenticons.github.com%2Fcf8f99b1f84a5ce73030c54bde5757d2.png&amp;r=x&amp;s=140" width="20" /></a>


    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img height="24" src="https://1.gravatar.com/avatar/c137530174721ead03151eb9f1fa2aa2?d=https%3A%2F%2Fidenticons.github.com%2F93a6b06568690c5dc1ee2d1df538b03a.png&amp;r=x&amp;s=140" width="24" />
            <a href="/timroes">timroes</a>
          </li>
          <li class="facebox-user-list-item">
            <img height="24" src="https://1.gravatar.com/avatar/19f33af017093834caecee97856322e6?d=https%3A%2F%2Fidenticons.github.com%2Fcf8f99b1f84a5ce73030c54bde5757d2.png&amp;r=x&amp;s=140" width="24" />
            <a href="/cketti">cketti</a>
          </li>
      </ul>
    </div>
  </div>

<div id="files" class="bubble">
  <div class="file">
    <div class="meta">
      <div class="info">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
          <span>1410 lines (1217 sloc)</span>
        <span>57.373 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped leftwards js-conduit-openfile-check"
               href="http://mac.github.com"
               data-url="github-mac://openRepo/https://github.com/schrockblock/EnhancedListView?branch=develop&amp;filepath=EnhancedListView%2Fsrc%2Fmain%2Fjava%2Fde%2Ftimroes%2Fandroid%2Flistview%2FEnhancedListView.java"
               title="Open this file in GitHub for Mac"
               data-failed-title="Your version of GitHub for Mac is too old to open this file. Try checking for updates.">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
                <a class="minibutton tooltipped upwards"
                   title="Clicking this button will automatically fork this project so you can edit the file"
                   href="/schrockblock/EnhancedListView/edit/develop/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java"
                   data-method="post" rel="nofollow">Edit</a>
          <a href="/schrockblock/EnhancedListView/raw/develop/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java" class="button minibutton " id="raw-url">Raw</a>
            <a href="/schrockblock/EnhancedListView/blame/develop/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java" class="button minibutton ">Blame</a>
          <a href="/schrockblock/EnhancedListView/commits/develop/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->
          <a class="minibutton danger empty-icon tooltipped downwards"
             href="/schrockblock/EnhancedListView/delete/develop/EnhancedListView/src/main/java/de/timroes/android/listview/EnhancedListView.java"
             title="Fork this project and delete file"
             data-method="post" data-test-id="delete-blob-file" rel="nofollow">
          Delete
        </a>
      </div><!-- /.actions -->

    </div>
        <div class="blob-wrapper data type-java js-blob-data">
        <table class="file-code file-diff">
          <tr class="file-code-line">
            <td class="blob-line-nums">
              <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
<span id="L333" rel="#L333">333</span>
<span id="L334" rel="#L334">334</span>
<span id="L335" rel="#L335">335</span>
<span id="L336" rel="#L336">336</span>
<span id="L337" rel="#L337">337</span>
<span id="L338" rel="#L338">338</span>
<span id="L339" rel="#L339">339</span>
<span id="L340" rel="#L340">340</span>
<span id="L341" rel="#L341">341</span>
<span id="L342" rel="#L342">342</span>
<span id="L343" rel="#L343">343</span>
<span id="L344" rel="#L344">344</span>
<span id="L345" rel="#L345">345</span>
<span id="L346" rel="#L346">346</span>
<span id="L347" rel="#L347">347</span>
<span id="L348" rel="#L348">348</span>
<span id="L349" rel="#L349">349</span>
<span id="L350" rel="#L350">350</span>
<span id="L351" rel="#L351">351</span>
<span id="L352" rel="#L352">352</span>
<span id="L353" rel="#L353">353</span>
<span id="L354" rel="#L354">354</span>
<span id="L355" rel="#L355">355</span>
<span id="L356" rel="#L356">356</span>
<span id="L357" rel="#L357">357</span>
<span id="L358" rel="#L358">358</span>
<span id="L359" rel="#L359">359</span>
<span id="L360" rel="#L360">360</span>
<span id="L361" rel="#L361">361</span>
<span id="L362" rel="#L362">362</span>
<span id="L363" rel="#L363">363</span>
<span id="L364" rel="#L364">364</span>
<span id="L365" rel="#L365">365</span>
<span id="L366" rel="#L366">366</span>
<span id="L367" rel="#L367">367</span>
<span id="L368" rel="#L368">368</span>
<span id="L369" rel="#L369">369</span>
<span id="L370" rel="#L370">370</span>
<span id="L371" rel="#L371">371</span>
<span id="L372" rel="#L372">372</span>
<span id="L373" rel="#L373">373</span>
<span id="L374" rel="#L374">374</span>
<span id="L375" rel="#L375">375</span>
<span id="L376" rel="#L376">376</span>
<span id="L377" rel="#L377">377</span>
<span id="L378" rel="#L378">378</span>
<span id="L379" rel="#L379">379</span>
<span id="L380" rel="#L380">380</span>
<span id="L381" rel="#L381">381</span>
<span id="L382" rel="#L382">382</span>
<span id="L383" rel="#L383">383</span>
<span id="L384" rel="#L384">384</span>
<span id="L385" rel="#L385">385</span>
<span id="L386" rel="#L386">386</span>
<span id="L387" rel="#L387">387</span>
<span id="L388" rel="#L388">388</span>
<span id="L389" rel="#L389">389</span>
<span id="L390" rel="#L390">390</span>
<span id="L391" rel="#L391">391</span>
<span id="L392" rel="#L392">392</span>
<span id="L393" rel="#L393">393</span>
<span id="L394" rel="#L394">394</span>
<span id="L395" rel="#L395">395</span>
<span id="L396" rel="#L396">396</span>
<span id="L397" rel="#L397">397</span>
<span id="L398" rel="#L398">398</span>
<span id="L399" rel="#L399">399</span>
<span id="L400" rel="#L400">400</span>
<span id="L401" rel="#L401">401</span>
<span id="L402" rel="#L402">402</span>
<span id="L403" rel="#L403">403</span>
<span id="L404" rel="#L404">404</span>
<span id="L405" rel="#L405">405</span>
<span id="L406" rel="#L406">406</span>
<span id="L407" rel="#L407">407</span>
<span id="L408" rel="#L408">408</span>
<span id="L409" rel="#L409">409</span>
<span id="L410" rel="#L410">410</span>
<span id="L411" rel="#L411">411</span>
<span id="L412" rel="#L412">412</span>
<span id="L413" rel="#L413">413</span>
<span id="L414" rel="#L414">414</span>
<span id="L415" rel="#L415">415</span>
<span id="L416" rel="#L416">416</span>
<span id="L417" rel="#L417">417</span>
<span id="L418" rel="#L418">418</span>
<span id="L419" rel="#L419">419</span>
<span id="L420" rel="#L420">420</span>
<span id="L421" rel="#L421">421</span>
<span id="L422" rel="#L422">422</span>
<span id="L423" rel="#L423">423</span>
<span id="L424" rel="#L424">424</span>
<span id="L425" rel="#L425">425</span>
<span id="L426" rel="#L426">426</span>
<span id="L427" rel="#L427">427</span>
<span id="L428" rel="#L428">428</span>
<span id="L429" rel="#L429">429</span>
<span id="L430" rel="#L430">430</span>
<span id="L431" rel="#L431">431</span>
<span id="L432" rel="#L432">432</span>
<span id="L433" rel="#L433">433</span>
<span id="L434" rel="#L434">434</span>
<span id="L435" rel="#L435">435</span>
<span id="L436" rel="#L436">436</span>
<span id="L437" rel="#L437">437</span>
<span id="L438" rel="#L438">438</span>
<span id="L439" rel="#L439">439</span>
<span id="L440" rel="#L440">440</span>
<span id="L441" rel="#L441">441</span>
<span id="L442" rel="#L442">442</span>
<span id="L443" rel="#L443">443</span>
<span id="L444" rel="#L444">444</span>
<span id="L445" rel="#L445">445</span>
<span id="L446" rel="#L446">446</span>
<span id="L447" rel="#L447">447</span>
<span id="L448" rel="#L448">448</span>
<span id="L449" rel="#L449">449</span>
<span id="L450" rel="#L450">450</span>
<span id="L451" rel="#L451">451</span>
<span id="L452" rel="#L452">452</span>
<span id="L453" rel="#L453">453</span>
<span id="L454" rel="#L454">454</span>
<span id="L455" rel="#L455">455</span>
<span id="L456" rel="#L456">456</span>
<span id="L457" rel="#L457">457</span>
<span id="L458" rel="#L458">458</span>
<span id="L459" rel="#L459">459</span>
<span id="L460" rel="#L460">460</span>
<span id="L461" rel="#L461">461</span>
<span id="L462" rel="#L462">462</span>
<span id="L463" rel="#L463">463</span>
<span id="L464" rel="#L464">464</span>
<span id="L465" rel="#L465">465</span>
<span id="L466" rel="#L466">466</span>
<span id="L467" rel="#L467">467</span>
<span id="L468" rel="#L468">468</span>
<span id="L469" rel="#L469">469</span>
<span id="L470" rel="#L470">470</span>
<span id="L471" rel="#L471">471</span>
<span id="L472" rel="#L472">472</span>
<span id="L473" rel="#L473">473</span>
<span id="L474" rel="#L474">474</span>
<span id="L475" rel="#L475">475</span>
<span id="L476" rel="#L476">476</span>
<span id="L477" rel="#L477">477</span>
<span id="L478" rel="#L478">478</span>
<span id="L479" rel="#L479">479</span>
<span id="L480" rel="#L480">480</span>
<span id="L481" rel="#L481">481</span>
<span id="L482" rel="#L482">482</span>
<span id="L483" rel="#L483">483</span>
<span id="L484" rel="#L484">484</span>
<span id="L485" rel="#L485">485</span>
<span id="L486" rel="#L486">486</span>
<span id="L487" rel="#L487">487</span>
<span id="L488" rel="#L488">488</span>
<span id="L489" rel="#L489">489</span>
<span id="L490" rel="#L490">490</span>
<span id="L491" rel="#L491">491</span>
<span id="L492" rel="#L492">492</span>
<span id="L493" rel="#L493">493</span>
<span id="L494" rel="#L494">494</span>
<span id="L495" rel="#L495">495</span>
<span id="L496" rel="#L496">496</span>
<span id="L497" rel="#L497">497</span>
<span id="L498" rel="#L498">498</span>
<span id="L499" rel="#L499">499</span>
<span id="L500" rel="#L500">500</span>
<span id="L501" rel="#L501">501</span>
<span id="L502" rel="#L502">502</span>
<span id="L503" rel="#L503">503</span>
<span id="L504" rel="#L504">504</span>
<span id="L505" rel="#L505">505</span>
<span id="L506" rel="#L506">506</span>
<span id="L507" rel="#L507">507</span>
<span id="L508" rel="#L508">508</span>
<span id="L509" rel="#L509">509</span>
<span id="L510" rel="#L510">510</span>
<span id="L511" rel="#L511">511</span>
<span id="L512" rel="#L512">512</span>
<span id="L513" rel="#L513">513</span>
<span id="L514" rel="#L514">514</span>
<span id="L515" rel="#L515">515</span>
<span id="L516" rel="#L516">516</span>
<span id="L517" rel="#L517">517</span>
<span id="L518" rel="#L518">518</span>
<span id="L519" rel="#L519">519</span>
<span id="L520" rel="#L520">520</span>
<span id="L521" rel="#L521">521</span>
<span id="L522" rel="#L522">522</span>
<span id="L523" rel="#L523">523</span>
<span id="L524" rel="#L524">524</span>
<span id="L525" rel="#L525">525</span>
<span id="L526" rel="#L526">526</span>
<span id="L527" rel="#L527">527</span>
<span id="L528" rel="#L528">528</span>
<span id="L529" rel="#L529">529</span>
<span id="L530" rel="#L530">530</span>
<span id="L531" rel="#L531">531</span>
<span id="L532" rel="#L532">532</span>
<span id="L533" rel="#L533">533</span>
<span id="L534" rel="#L534">534</span>
<span id="L535" rel="#L535">535</span>
<span id="L536" rel="#L536">536</span>
<span id="L537" rel="#L537">537</span>
<span id="L538" rel="#L538">538</span>
<span id="L539" rel="#L539">539</span>
<span id="L540" rel="#L540">540</span>
<span id="L541" rel="#L541">541</span>
<span id="L542" rel="#L542">542</span>
<span id="L543" rel="#L543">543</span>
<span id="L544" rel="#L544">544</span>
<span id="L545" rel="#L545">545</span>
<span id="L546" rel="#L546">546</span>
<span id="L547" rel="#L547">547</span>
<span id="L548" rel="#L548">548</span>
<span id="L549" rel="#L549">549</span>
<span id="L550" rel="#L550">550</span>
<span id="L551" rel="#L551">551</span>
<span id="L552" rel="#L552">552</span>
<span id="L553" rel="#L553">553</span>
<span id="L554" rel="#L554">554</span>
<span id="L555" rel="#L555">555</span>
<span id="L556" rel="#L556">556</span>
<span id="L557" rel="#L557">557</span>
<span id="L558" rel="#L558">558</span>
<span id="L559" rel="#L559">559</span>
<span id="L560" rel="#L560">560</span>
<span id="L561" rel="#L561">561</span>
<span id="L562" rel="#L562">562</span>
<span id="L563" rel="#L563">563</span>
<span id="L564" rel="#L564">564</span>
<span id="L565" rel="#L565">565</span>
<span id="L566" rel="#L566">566</span>
<span id="L567" rel="#L567">567</span>
<span id="L568" rel="#L568">568</span>
<span id="L569" rel="#L569">569</span>
<span id="L570" rel="#L570">570</span>
<span id="L571" rel="#L571">571</span>
<span id="L572" rel="#L572">572</span>
<span id="L573" rel="#L573">573</span>
<span id="L574" rel="#L574">574</span>
<span id="L575" rel="#L575">575</span>
<span id="L576" rel="#L576">576</span>
<span id="L577" rel="#L577">577</span>
<span id="L578" rel="#L578">578</span>
<span id="L579" rel="#L579">579</span>
<span id="L580" rel="#L580">580</span>
<span id="L581" rel="#L581">581</span>
<span id="L582" rel="#L582">582</span>
<span id="L583" rel="#L583">583</span>
<span id="L584" rel="#L584">584</span>
<span id="L585" rel="#L585">585</span>
<span id="L586" rel="#L586">586</span>
<span id="L587" rel="#L587">587</span>
<span id="L588" rel="#L588">588</span>
<span id="L589" rel="#L589">589</span>
<span id="L590" rel="#L590">590</span>
<span id="L591" rel="#L591">591</span>
<span id="L592" rel="#L592">592</span>
<span id="L593" rel="#L593">593</span>
<span id="L594" rel="#L594">594</span>
<span id="L595" rel="#L595">595</span>
<span id="L596" rel="#L596">596</span>
<span id="L597" rel="#L597">597</span>
<span id="L598" rel="#L598">598</span>
<span id="L599" rel="#L599">599</span>
<span id="L600" rel="#L600">600</span>
<span id="L601" rel="#L601">601</span>
<span id="L602" rel="#L602">602</span>
<span id="L603" rel="#L603">603</span>
<span id="L604" rel="#L604">604</span>
<span id="L605" rel="#L605">605</span>
<span id="L606" rel="#L606">606</span>
<span id="L607" rel="#L607">607</span>
<span id="L608" rel="#L608">608</span>
<span id="L609" rel="#L609">609</span>
<span id="L610" rel="#L610">610</span>
<span id="L611" rel="#L611">611</span>
<span id="L612" rel="#L612">612</span>
<span id="L613" rel="#L613">613</span>
<span id="L614" rel="#L614">614</span>
<span id="L615" rel="#L615">615</span>
<span id="L616" rel="#L616">616</span>
<span id="L617" rel="#L617">617</span>
<span id="L618" rel="#L618">618</span>
<span id="L619" rel="#L619">619</span>
<span id="L620" rel="#L620">620</span>
<span id="L621" rel="#L621">621</span>
<span id="L622" rel="#L622">622</span>
<span id="L623" rel="#L623">623</span>
<span id="L624" rel="#L624">624</span>
<span id="L625" rel="#L625">625</span>
<span id="L626" rel="#L626">626</span>
<span id="L627" rel="#L627">627</span>
<span id="L628" rel="#L628">628</span>
<span id="L629" rel="#L629">629</span>
<span id="L630" rel="#L630">630</span>
<span id="L631" rel="#L631">631</span>
<span id="L632" rel="#L632">632</span>
<span id="L633" rel="#L633">633</span>
<span id="L634" rel="#L634">634</span>
<span id="L635" rel="#L635">635</span>
<span id="L636" rel="#L636">636</span>
<span id="L637" rel="#L637">637</span>
<span id="L638" rel="#L638">638</span>
<span id="L639" rel="#L639">639</span>
<span id="L640" rel="#L640">640</span>
<span id="L641" rel="#L641">641</span>
<span id="L642" rel="#L642">642</span>
<span id="L643" rel="#L643">643</span>
<span id="L644" rel="#L644">644</span>
<span id="L645" rel="#L645">645</span>
<span id="L646" rel="#L646">646</span>
<span id="L647" rel="#L647">647</span>
<span id="L648" rel="#L648">648</span>
<span id="L649" rel="#L649">649</span>
<span id="L650" rel="#L650">650</span>
<span id="L651" rel="#L651">651</span>
<span id="L652" rel="#L652">652</span>
<span id="L653" rel="#L653">653</span>
<span id="L654" rel="#L654">654</span>
<span id="L655" rel="#L655">655</span>
<span id="L656" rel="#L656">656</span>
<span id="L657" rel="#L657">657</span>
<span id="L658" rel="#L658">658</span>
<span id="L659" rel="#L659">659</span>
<span id="L660" rel="#L660">660</span>
<span id="L661" rel="#L661">661</span>
<span id="L662" rel="#L662">662</span>
<span id="L663" rel="#L663">663</span>
<span id="L664" rel="#L664">664</span>
<span id="L665" rel="#L665">665</span>
<span id="L666" rel="#L666">666</span>
<span id="L667" rel="#L667">667</span>
<span id="L668" rel="#L668">668</span>
<span id="L669" rel="#L669">669</span>
<span id="L670" rel="#L670">670</span>
<span id="L671" rel="#L671">671</span>
<span id="L672" rel="#L672">672</span>
<span id="L673" rel="#L673">673</span>
<span id="L674" rel="#L674">674</span>
<span id="L675" rel="#L675">675</span>
<span id="L676" rel="#L676">676</span>
<span id="L677" rel="#L677">677</span>
<span id="L678" rel="#L678">678</span>
<span id="L679" rel="#L679">679</span>
<span id="L680" rel="#L680">680</span>
<span id="L681" rel="#L681">681</span>
<span id="L682" rel="#L682">682</span>
<span id="L683" rel="#L683">683</span>
<span id="L684" rel="#L684">684</span>
<span id="L685" rel="#L685">685</span>
<span id="L686" rel="#L686">686</span>
<span id="L687" rel="#L687">687</span>
<span id="L688" rel="#L688">688</span>
<span id="L689" rel="#L689">689</span>
<span id="L690" rel="#L690">690</span>
<span id="L691" rel="#L691">691</span>
<span id="L692" rel="#L692">692</span>
<span id="L693" rel="#L693">693</span>
<span id="L694" rel="#L694">694</span>
<span id="L695" rel="#L695">695</span>
<span id="L696" rel="#L696">696</span>
<span id="L697" rel="#L697">697</span>
<span id="L698" rel="#L698">698</span>
<span id="L699" rel="#L699">699</span>
<span id="L700" rel="#L700">700</span>
<span id="L701" rel="#L701">701</span>
<span id="L702" rel="#L702">702</span>
<span id="L703" rel="#L703">703</span>
<span id="L704" rel="#L704">704</span>
<span id="L705" rel="#L705">705</span>
<span id="L706" rel="#L706">706</span>
<span id="L707" rel="#L707">707</span>
<span id="L708" rel="#L708">708</span>
<span id="L709" rel="#L709">709</span>
<span id="L710" rel="#L710">710</span>
<span id="L711" rel="#L711">711</span>
<span id="L712" rel="#L712">712</span>
<span id="L713" rel="#L713">713</span>
<span id="L714" rel="#L714">714</span>
<span id="L715" rel="#L715">715</span>
<span id="L716" rel="#L716">716</span>
<span id="L717" rel="#L717">717</span>
<span id="L718" rel="#L718">718</span>
<span id="L719" rel="#L719">719</span>
<span id="L720" rel="#L720">720</span>
<span id="L721" rel="#L721">721</span>
<span id="L722" rel="#L722">722</span>
<span id="L723" rel="#L723">723</span>
<span id="L724" rel="#L724">724</span>
<span id="L725" rel="#L725">725</span>
<span id="L726" rel="#L726">726</span>
<span id="L727" rel="#L727">727</span>
<span id="L728" rel="#L728">728</span>
<span id="L729" rel="#L729">729</span>
<span id="L730" rel="#L730">730</span>
<span id="L731" rel="#L731">731</span>
<span id="L732" rel="#L732">732</span>
<span id="L733" rel="#L733">733</span>
<span id="L734" rel="#L734">734</span>
<span id="L735" rel="#L735">735</span>
<span id="L736" rel="#L736">736</span>
<span id="L737" rel="#L737">737</span>
<span id="L738" rel="#L738">738</span>
<span id="L739" rel="#L739">739</span>
<span id="L740" rel="#L740">740</span>
<span id="L741" rel="#L741">741</span>
<span id="L742" rel="#L742">742</span>
<span id="L743" rel="#L743">743</span>
<span id="L744" rel="#L744">744</span>
<span id="L745" rel="#L745">745</span>
<span id="L746" rel="#L746">746</span>
<span id="L747" rel="#L747">747</span>
<span id="L748" rel="#L748">748</span>
<span id="L749" rel="#L749">749</span>
<span id="L750" rel="#L750">750</span>
<span id="L751" rel="#L751">751</span>
<span id="L752" rel="#L752">752</span>
<span id="L753" rel="#L753">753</span>
<span id="L754" rel="#L754">754</span>
<span id="L755" rel="#L755">755</span>
<span id="L756" rel="#L756">756</span>
<span id="L757" rel="#L757">757</span>
<span id="L758" rel="#L758">758</span>
<span id="L759" rel="#L759">759</span>
<span id="L760" rel="#L760">760</span>
<span id="L761" rel="#L761">761</span>
<span id="L762" rel="#L762">762</span>
<span id="L763" rel="#L763">763</span>
<span id="L764" rel="#L764">764</span>
<span id="L765" rel="#L765">765</span>
<span id="L766" rel="#L766">766</span>
<span id="L767" rel="#L767">767</span>
<span id="L768" rel="#L768">768</span>
<span id="L769" rel="#L769">769</span>
<span id="L770" rel="#L770">770</span>
<span id="L771" rel="#L771">771</span>
<span id="L772" rel="#L772">772</span>
<span id="L773" rel="#L773">773</span>
<span id="L774" rel="#L774">774</span>
<span id="L775" rel="#L775">775</span>
<span id="L776" rel="#L776">776</span>
<span id="L777" rel="#L777">777</span>
<span id="L778" rel="#L778">778</span>
<span id="L779" rel="#L779">779</span>
<span id="L780" rel="#L780">780</span>
<span id="L781" rel="#L781">781</span>
<span id="L782" rel="#L782">782</span>
<span id="L783" rel="#L783">783</span>
<span id="L784" rel="#L784">784</span>
<span id="L785" rel="#L785">785</span>
<span id="L786" rel="#L786">786</span>
<span id="L787" rel="#L787">787</span>
<span id="L788" rel="#L788">788</span>
<span id="L789" rel="#L789">789</span>
<span id="L790" rel="#L790">790</span>
<span id="L791" rel="#L791">791</span>
<span id="L792" rel="#L792">792</span>
<span id="L793" rel="#L793">793</span>
<span id="L794" rel="#L794">794</span>
<span id="L795" rel="#L795">795</span>
<span id="L796" rel="#L796">796</span>
<span id="L797" rel="#L797">797</span>
<span id="L798" rel="#L798">798</span>
<span id="L799" rel="#L799">799</span>
<span id="L800" rel="#L800">800</span>
<span id="L801" rel="#L801">801</span>
<span id="L802" rel="#L802">802</span>
<span id="L803" rel="#L803">803</span>
<span id="L804" rel="#L804">804</span>
<span id="L805" rel="#L805">805</span>
<span id="L806" rel="#L806">806</span>
<span id="L807" rel="#L807">807</span>
<span id="L808" rel="#L808">808</span>
<span id="L809" rel="#L809">809</span>
<span id="L810" rel="#L810">810</span>
<span id="L811" rel="#L811">811</span>
<span id="L812" rel="#L812">812</span>
<span id="L813" rel="#L813">813</span>
<span id="L814" rel="#L814">814</span>
<span id="L815" rel="#L815">815</span>
<span id="L816" rel="#L816">816</span>
<span id="L817" rel="#L817">817</span>
<span id="L818" rel="#L818">818</span>
<span id="L819" rel="#L819">819</span>
<span id="L820" rel="#L820">820</span>
<span id="L821" rel="#L821">821</span>
<span id="L822" rel="#L822">822</span>
<span id="L823" rel="#L823">823</span>
<span id="L824" rel="#L824">824</span>
<span id="L825" rel="#L825">825</span>
<span id="L826" rel="#L826">826</span>
<span id="L827" rel="#L827">827</span>
<span id="L828" rel="#L828">828</span>
<span id="L829" rel="#L829">829</span>
<span id="L830" rel="#L830">830</span>
<span id="L831" rel="#L831">831</span>
<span id="L832" rel="#L832">832</span>
<span id="L833" rel="#L833">833</span>
<span id="L834" rel="#L834">834</span>
<span id="L835" rel="#L835">835</span>
<span id="L836" rel="#L836">836</span>
<span id="L837" rel="#L837">837</span>
<span id="L838" rel="#L838">838</span>
<span id="L839" rel="#L839">839</span>
<span id="L840" rel="#L840">840</span>
<span id="L841" rel="#L841">841</span>
<span id="L842" rel="#L842">842</span>
<span id="L843" rel="#L843">843</span>
<span id="L844" rel="#L844">844</span>
<span id="L845" rel="#L845">845</span>
<span id="L846" rel="#L846">846</span>
<span id="L847" rel="#L847">847</span>
<span id="L848" rel="#L848">848</span>
<span id="L849" rel="#L849">849</span>
<span id="L850" rel="#L850">850</span>
<span id="L851" rel="#L851">851</span>
<span id="L852" rel="#L852">852</span>
<span id="L853" rel="#L853">853</span>
<span id="L854" rel="#L854">854</span>
<span id="L855" rel="#L855">855</span>
<span id="L856" rel="#L856">856</span>
<span id="L857" rel="#L857">857</span>
<span id="L858" rel="#L858">858</span>
<span id="L859" rel="#L859">859</span>
<span id="L860" rel="#L860">860</span>
<span id="L861" rel="#L861">861</span>
<span id="L862" rel="#L862">862</span>
<span id="L863" rel="#L863">863</span>
<span id="L864" rel="#L864">864</span>
<span id="L865" rel="#L865">865</span>
<span id="L866" rel="#L866">866</span>
<span id="L867" rel="#L867">867</span>
<span id="L868" rel="#L868">868</span>
<span id="L869" rel="#L869">869</span>
<span id="L870" rel="#L870">870</span>
<span id="L871" rel="#L871">871</span>
<span id="L872" rel="#L872">872</span>
<span id="L873" rel="#L873">873</span>
<span id="L874" rel="#L874">874</span>
<span id="L875" rel="#L875">875</span>
<span id="L876" rel="#L876">876</span>
<span id="L877" rel="#L877">877</span>
<span id="L878" rel="#L878">878</span>
<span id="L879" rel="#L879">879</span>
<span id="L880" rel="#L880">880</span>
<span id="L881" rel="#L881">881</span>
<span id="L882" rel="#L882">882</span>
<span id="L883" rel="#L883">883</span>
<span id="L884" rel="#L884">884</span>
<span id="L885" rel="#L885">885</span>
<span id="L886" rel="#L886">886</span>
<span id="L887" rel="#L887">887</span>
<span id="L888" rel="#L888">888</span>
<span id="L889" rel="#L889">889</span>
<span id="L890" rel="#L890">890</span>
<span id="L891" rel="#L891">891</span>
<span id="L892" rel="#L892">892</span>
<span id="L893" rel="#L893">893</span>
<span id="L894" rel="#L894">894</span>
<span id="L895" rel="#L895">895</span>
<span id="L896" rel="#L896">896</span>
<span id="L897" rel="#L897">897</span>
<span id="L898" rel="#L898">898</span>
<span id="L899" rel="#L899">899</span>
<span id="L900" rel="#L900">900</span>
<span id="L901" rel="#L901">901</span>
<span id="L902" rel="#L902">902</span>
<span id="L903" rel="#L903">903</span>
<span id="L904" rel="#L904">904</span>
<span id="L905" rel="#L905">905</span>
<span id="L906" rel="#L906">906</span>
<span id="L907" rel="#L907">907</span>
<span id="L908" rel="#L908">908</span>
<span id="L909" rel="#L909">909</span>
<span id="L910" rel="#L910">910</span>
<span id="L911" rel="#L911">911</span>
<span id="L912" rel="#L912">912</span>
<span id="L913" rel="#L913">913</span>
<span id="L914" rel="#L914">914</span>
<span id="L915" rel="#L915">915</span>
<span id="L916" rel="#L916">916</span>
<span id="L917" rel="#L917">917</span>
<span id="L918" rel="#L918">918</span>
<span id="L919" rel="#L919">919</span>
<span id="L920" rel="#L920">920</span>
<span id="L921" rel="#L921">921</span>
<span id="L922" rel="#L922">922</span>
<span id="L923" rel="#L923">923</span>
<span id="L924" rel="#L924">924</span>
<span id="L925" rel="#L925">925</span>
<span id="L926" rel="#L926">926</span>
<span id="L927" rel="#L927">927</span>
<span id="L928" rel="#L928">928</span>
<span id="L929" rel="#L929">929</span>
<span id="L930" rel="#L930">930</span>
<span id="L931" rel="#L931">931</span>
<span id="L932" rel="#L932">932</span>
<span id="L933" rel="#L933">933</span>
<span id="L934" rel="#L934">934</span>
<span id="L935" rel="#L935">935</span>
<span id="L936" rel="#L936">936</span>
<span id="L937" rel="#L937">937</span>
<span id="L938" rel="#L938">938</span>
<span id="L939" rel="#L939">939</span>
<span id="L940" rel="#L940">940</span>
<span id="L941" rel="#L941">941</span>
<span id="L942" rel="#L942">942</span>
<span id="L943" rel="#L943">943</span>
<span id="L944" rel="#L944">944</span>
<span id="L945" rel="#L945">945</span>
<span id="L946" rel="#L946">946</span>
<span id="L947" rel="#L947">947</span>
<span id="L948" rel="#L948">948</span>
<span id="L949" rel="#L949">949</span>
<span id="L950" rel="#L950">950</span>
<span id="L951" rel="#L951">951</span>
<span id="L952" rel="#L952">952</span>
<span id="L953" rel="#L953">953</span>
<span id="L954" rel="#L954">954</span>
<span id="L955" rel="#L955">955</span>
<span id="L956" rel="#L956">956</span>
<span id="L957" rel="#L957">957</span>
<span id="L958" rel="#L958">958</span>
<span id="L959" rel="#L959">959</span>
<span id="L960" rel="#L960">960</span>
<span id="L961" rel="#L961">961</span>
<span id="L962" rel="#L962">962</span>
<span id="L963" rel="#L963">963</span>
<span id="L964" rel="#L964">964</span>
<span id="L965" rel="#L965">965</span>
<span id="L966" rel="#L966">966</span>
<span id="L967" rel="#L967">967</span>
<span id="L968" rel="#L968">968</span>
<span id="L969" rel="#L969">969</span>
<span id="L970" rel="#L970">970</span>
<span id="L971" rel="#L971">971</span>
<span id="L972" rel="#L972">972</span>
<span id="L973" rel="#L973">973</span>
<span id="L974" rel="#L974">974</span>
<span id="L975" rel="#L975">975</span>
<span id="L976" rel="#L976">976</span>
<span id="L977" rel="#L977">977</span>
<span id="L978" rel="#L978">978</span>
<span id="L979" rel="#L979">979</span>
<span id="L980" rel="#L980">980</span>
<span id="L981" rel="#L981">981</span>
<span id="L982" rel="#L982">982</span>
<span id="L983" rel="#L983">983</span>
<span id="L984" rel="#L984">984</span>
<span id="L985" rel="#L985">985</span>
<span id="L986" rel="#L986">986</span>
<span id="L987" rel="#L987">987</span>
<span id="L988" rel="#L988">988</span>
<span id="L989" rel="#L989">989</span>
<span id="L990" rel="#L990">990</span>
<span id="L991" rel="#L991">991</span>
<span id="L992" rel="#L992">992</span>
<span id="L993" rel="#L993">993</span>
<span id="L994" rel="#L994">994</span>
<span id="L995" rel="#L995">995</span>
<span id="L996" rel="#L996">996</span>
<span id="L997" rel="#L997">997</span>
<span id="L998" rel="#L998">998</span>
<span id="L999" rel="#L999">999</span>
<span id="L1000" rel="#L1000">1000</span>
<span id="L1001" rel="#L1001">1001</span>
<span id="L1002" rel="#L1002">1002</span>
<span id="L1003" rel="#L1003">1003</span>
<span id="L1004" rel="#L1004">1004</span>
<span id="L1005" rel="#L1005">1005</span>
<span id="L1006" rel="#L1006">1006</span>
<span id="L1007" rel="#L1007">1007</span>
<span id="L1008" rel="#L1008">1008</span>
<span id="L1009" rel="#L1009">1009</span>
<span id="L1010" rel="#L1010">1010</span>
<span id="L1011" rel="#L1011">1011</span>
<span id="L1012" rel="#L1012">1012</span>
<span id="L1013" rel="#L1013">1013</span>
<span id="L1014" rel="#L1014">1014</span>
<span id="L1015" rel="#L1015">1015</span>
<span id="L1016" rel="#L1016">1016</span>
<span id="L1017" rel="#L1017">1017</span>
<span id="L1018" rel="#L1018">1018</span>
<span id="L1019" rel="#L1019">1019</span>
<span id="L1020" rel="#L1020">1020</span>
<span id="L1021" rel="#L1021">1021</span>
<span id="L1022" rel="#L1022">1022</span>
<span id="L1023" rel="#L1023">1023</span>
<span id="L1024" rel="#L1024">1024</span>
<span id="L1025" rel="#L1025">1025</span>
<span id="L1026" rel="#L1026">1026</span>
<span id="L1027" rel="#L1027">1027</span>
<span id="L1028" rel="#L1028">1028</span>
<span id="L1029" rel="#L1029">1029</span>
<span id="L1030" rel="#L1030">1030</span>
<span id="L1031" rel="#L1031">1031</span>
<span id="L1032" rel="#L1032">1032</span>
<span id="L1033" rel="#L1033">1033</span>
<span id="L1034" rel="#L1034">1034</span>
<span id="L1035" rel="#L1035">1035</span>
<span id="L1036" rel="#L1036">1036</span>
<span id="L1037" rel="#L1037">1037</span>
<span id="L1038" rel="#L1038">1038</span>
<span id="L1039" rel="#L1039">1039</span>
<span id="L1040" rel="#L1040">1040</span>
<span id="L1041" rel="#L1041">1041</span>
<span id="L1042" rel="#L1042">1042</span>
<span id="L1043" rel="#L1043">1043</span>
<span id="L1044" rel="#L1044">1044</span>
<span id="L1045" rel="#L1045">1045</span>
<span id="L1046" rel="#L1046">1046</span>
<span id="L1047" rel="#L1047">1047</span>
<span id="L1048" rel="#L1048">1048</span>
<span id="L1049" rel="#L1049">1049</span>
<span id="L1050" rel="#L1050">1050</span>
<span id="L1051" rel="#L1051">1051</span>
<span id="L1052" rel="#L1052">1052</span>
<span id="L1053" rel="#L1053">1053</span>
<span id="L1054" rel="#L1054">1054</span>
<span id="L1055" rel="#L1055">1055</span>
<span id="L1056" rel="#L1056">1056</span>
<span id="L1057" rel="#L1057">1057</span>
<span id="L1058" rel="#L1058">1058</span>
<span id="L1059" rel="#L1059">1059</span>
<span id="L1060" rel="#L1060">1060</span>
<span id="L1061" rel="#L1061">1061</span>
<span id="L1062" rel="#L1062">1062</span>
<span id="L1063" rel="#L1063">1063</span>
<span id="L1064" rel="#L1064">1064</span>
<span id="L1065" rel="#L1065">1065</span>
<span id="L1066" rel="#L1066">1066</span>
<span id="L1067" rel="#L1067">1067</span>
<span id="L1068" rel="#L1068">1068</span>
<span id="L1069" rel="#L1069">1069</span>
<span id="L1070" rel="#L1070">1070</span>
<span id="L1071" rel="#L1071">1071</span>
<span id="L1072" rel="#L1072">1072</span>
<span id="L1073" rel="#L1073">1073</span>
<span id="L1074" rel="#L1074">1074</span>
<span id="L1075" rel="#L1075">1075</span>
<span id="L1076" rel="#L1076">1076</span>
<span id="L1077" rel="#L1077">1077</span>
<span id="L1078" rel="#L1078">1078</span>
<span id="L1079" rel="#L1079">1079</span>
<span id="L1080" rel="#L1080">1080</span>
<span id="L1081" rel="#L1081">1081</span>
<span id="L1082" rel="#L1082">1082</span>
<span id="L1083" rel="#L1083">1083</span>
<span id="L1084" rel="#L1084">1084</span>
<span id="L1085" rel="#L1085">1085</span>
<span id="L1086" rel="#L1086">1086</span>
<span id="L1087" rel="#L1087">1087</span>
<span id="L1088" rel="#L1088">1088</span>
<span id="L1089" rel="#L1089">1089</span>
<span id="L1090" rel="#L1090">1090</span>
<span id="L1091" rel="#L1091">1091</span>
<span id="L1092" rel="#L1092">1092</span>
<span id="L1093" rel="#L1093">1093</span>
<span id="L1094" rel="#L1094">1094</span>
<span id="L1095" rel="#L1095">1095</span>
<span id="L1096" rel="#L1096">1096</span>
<span id="L1097" rel="#L1097">1097</span>
<span id="L1098" rel="#L1098">1098</span>
<span id="L1099" rel="#L1099">1099</span>
<span id="L1100" rel="#L1100">1100</span>
<span id="L1101" rel="#L1101">1101</span>
<span id="L1102" rel="#L1102">1102</span>
<span id="L1103" rel="#L1103">1103</span>
<span id="L1104" rel="#L1104">1104</span>
<span id="L1105" rel="#L1105">1105</span>
<span id="L1106" rel="#L1106">1106</span>
<span id="L1107" rel="#L1107">1107</span>
<span id="L1108" rel="#L1108">1108</span>
<span id="L1109" rel="#L1109">1109</span>
<span id="L1110" rel="#L1110">1110</span>
<span id="L1111" rel="#L1111">1111</span>
<span id="L1112" rel="#L1112">1112</span>
<span id="L1113" rel="#L1113">1113</span>
<span id="L1114" rel="#L1114">1114</span>
<span id="L1115" rel="#L1115">1115</span>
<span id="L1116" rel="#L1116">1116</span>
<span id="L1117" rel="#L1117">1117</span>
<span id="L1118" rel="#L1118">1118</span>
<span id="L1119" rel="#L1119">1119</span>
<span id="L1120" rel="#L1120">1120</span>
<span id="L1121" rel="#L1121">1121</span>
<span id="L1122" rel="#L1122">1122</span>
<span id="L1123" rel="#L1123">1123</span>
<span id="L1124" rel="#L1124">1124</span>
<span id="L1125" rel="#L1125">1125</span>
<span id="L1126" rel="#L1126">1126</span>
<span id="L1127" rel="#L1127">1127</span>
<span id="L1128" rel="#L1128">1128</span>
<span id="L1129" rel="#L1129">1129</span>
<span id="L1130" rel="#L1130">1130</span>
<span id="L1131" rel="#L1131">1131</span>
<span id="L1132" rel="#L1132">1132</span>
<span id="L1133" rel="#L1133">1133</span>
<span id="L1134" rel="#L1134">1134</span>
<span id="L1135" rel="#L1135">1135</span>
<span id="L1136" rel="#L1136">1136</span>
<span id="L1137" rel="#L1137">1137</span>
<span id="L1138" rel="#L1138">1138</span>
<span id="L1139" rel="#L1139">1139</span>
<span id="L1140" rel="#L1140">1140</span>
<span id="L1141" rel="#L1141">1141</span>
<span id="L1142" rel="#L1142">1142</span>
<span id="L1143" rel="#L1143">1143</span>
<span id="L1144" rel="#L1144">1144</span>
<span id="L1145" rel="#L1145">1145</span>
<span id="L1146" rel="#L1146">1146</span>
<span id="L1147" rel="#L1147">1147</span>
<span id="L1148" rel="#L1148">1148</span>
<span id="L1149" rel="#L1149">1149</span>
<span id="L1150" rel="#L1150">1150</span>
<span id="L1151" rel="#L1151">1151</span>
<span id="L1152" rel="#L1152">1152</span>
<span id="L1153" rel="#L1153">1153</span>
<span id="L1154" rel="#L1154">1154</span>
<span id="L1155" rel="#L1155">1155</span>
<span id="L1156" rel="#L1156">1156</span>
<span id="L1157" rel="#L1157">1157</span>
<span id="L1158" rel="#L1158">1158</span>
<span id="L1159" rel="#L1159">1159</span>
<span id="L1160" rel="#L1160">1160</span>
<span id="L1161" rel="#L1161">1161</span>
<span id="L1162" rel="#L1162">1162</span>
<span id="L1163" rel="#L1163">1163</span>
<span id="L1164" rel="#L1164">1164</span>
<span id="L1165" rel="#L1165">1165</span>
<span id="L1166" rel="#L1166">1166</span>
<span id="L1167" rel="#L1167">1167</span>
<span id="L1168" rel="#L1168">1168</span>
<span id="L1169" rel="#L1169">1169</span>
<span id="L1170" rel="#L1170">1170</span>
<span id="L1171" rel="#L1171">1171</span>
<span id="L1172" rel="#L1172">1172</span>
<span id="L1173" rel="#L1173">1173</span>
<span id="L1174" rel="#L1174">1174</span>
<span id="L1175" rel="#L1175">1175</span>
<span id="L1176" rel="#L1176">1176</span>
<span id="L1177" rel="#L1177">1177</span>
<span id="L1178" rel="#L1178">1178</span>
<span id="L1179" rel="#L1179">1179</span>
<span id="L1180" rel="#L1180">1180</span>
<span id="L1181" rel="#L1181">1181</span>
<span id="L1182" rel="#L1182">1182</span>
<span id="L1183" rel="#L1183">1183</span>
<span id="L1184" rel="#L1184">1184</span>
<span id="L1185" rel="#L1185">1185</span>
<span id="L1186" rel="#L1186">1186</span>
<span id="L1187" rel="#L1187">1187</span>
<span id="L1188" rel="#L1188">1188</span>
<span id="L1189" rel="#L1189">1189</span>
<span id="L1190" rel="#L1190">1190</span>
<span id="L1191" rel="#L1191">1191</span>
<span id="L1192" rel="#L1192">1192</span>
<span id="L1193" rel="#L1193">1193</span>
<span id="L1194" rel="#L1194">1194</span>
<span id="L1195" rel="#L1195">1195</span>
<span id="L1196" rel="#L1196">1196</span>
<span id="L1197" rel="#L1197">1197</span>
<span id="L1198" rel="#L1198">1198</span>
<span id="L1199" rel="#L1199">1199</span>
<span id="L1200" rel="#L1200">1200</span>
<span id="L1201" rel="#L1201">1201</span>
<span id="L1202" rel="#L1202">1202</span>
<span id="L1203" rel="#L1203">1203</span>
<span id="L1204" rel="#L1204">1204</span>
<span id="L1205" rel="#L1205">1205</span>
<span id="L1206" rel="#L1206">1206</span>
<span id="L1207" rel="#L1207">1207</span>
<span id="L1208" rel="#L1208">1208</span>
<span id="L1209" rel="#L1209">1209</span>
<span id="L1210" rel="#L1210">1210</span>
<span id="L1211" rel="#L1211">1211</span>
<span id="L1212" rel="#L1212">1212</span>
<span id="L1213" rel="#L1213">1213</span>
<span id="L1214" rel="#L1214">1214</span>
<span id="L1215" rel="#L1215">1215</span>
<span id="L1216" rel="#L1216">1216</span>
<span id="L1217" rel="#L1217">1217</span>
<span id="L1218" rel="#L1218">1218</span>
<span id="L1219" rel="#L1219">1219</span>
<span id="L1220" rel="#L1220">1220</span>
<span id="L1221" rel="#L1221">1221</span>
<span id="L1222" rel="#L1222">1222</span>
<span id="L1223" rel="#L1223">1223</span>
<span id="L1224" rel="#L1224">1224</span>
<span id="L1225" rel="#L1225">1225</span>
<span id="L1226" rel="#L1226">1226</span>
<span id="L1227" rel="#L1227">1227</span>
<span id="L1228" rel="#L1228">1228</span>
<span id="L1229" rel="#L1229">1229</span>
<span id="L1230" rel="#L1230">1230</span>
<span id="L1231" rel="#L1231">1231</span>
<span id="L1232" rel="#L1232">1232</span>
<span id="L1233" rel="#L1233">1233</span>
<span id="L1234" rel="#L1234">1234</span>
<span id="L1235" rel="#L1235">1235</span>
<span id="L1236" rel="#L1236">1236</span>
<span id="L1237" rel="#L1237">1237</span>
<span id="L1238" rel="#L1238">1238</span>
<span id="L1239" rel="#L1239">1239</span>
<span id="L1240" rel="#L1240">1240</span>
<span id="L1241" rel="#L1241">1241</span>
<span id="L1242" rel="#L1242">1242</span>
<span id="L1243" rel="#L1243">1243</span>
<span id="L1244" rel="#L1244">1244</span>
<span id="L1245" rel="#L1245">1245</span>
<span id="L1246" rel="#L1246">1246</span>
<span id="L1247" rel="#L1247">1247</span>
<span id="L1248" rel="#L1248">1248</span>
<span id="L1249" rel="#L1249">1249</span>
<span id="L1250" rel="#L1250">1250</span>
<span id="L1251" rel="#L1251">1251</span>
<span id="L1252" rel="#L1252">1252</span>
<span id="L1253" rel="#L1253">1253</span>
<span id="L1254" rel="#L1254">1254</span>
<span id="L1255" rel="#L1255">1255</span>
<span id="L1256" rel="#L1256">1256</span>
<span id="L1257" rel="#L1257">1257</span>
<span id="L1258" rel="#L1258">1258</span>
<span id="L1259" rel="#L1259">1259</span>
<span id="L1260" rel="#L1260">1260</span>
<span id="L1261" rel="#L1261">1261</span>
<span id="L1262" rel="#L1262">1262</span>
<span id="L1263" rel="#L1263">1263</span>
<span id="L1264" rel="#L1264">1264</span>
<span id="L1265" rel="#L1265">1265</span>
<span id="L1266" rel="#L1266">1266</span>
<span id="L1267" rel="#L1267">1267</span>
<span id="L1268" rel="#L1268">1268</span>
<span id="L1269" rel="#L1269">1269</span>
<span id="L1270" rel="#L1270">1270</span>
<span id="L1271" rel="#L1271">1271</span>
<span id="L1272" rel="#L1272">1272</span>
<span id="L1273" rel="#L1273">1273</span>
<span id="L1274" rel="#L1274">1274</span>
<span id="L1275" rel="#L1275">1275</span>
<span id="L1276" rel="#L1276">1276</span>
<span id="L1277" rel="#L1277">1277</span>
<span id="L1278" rel="#L1278">1278</span>
<span id="L1279" rel="#L1279">1279</span>
<span id="L1280" rel="#L1280">1280</span>
<span id="L1281" rel="#L1281">1281</span>
<span id="L1282" rel="#L1282">1282</span>
<span id="L1283" rel="#L1283">1283</span>
<span id="L1284" rel="#L1284">1284</span>
<span id="L1285" rel="#L1285">1285</span>
<span id="L1286" rel="#L1286">1286</span>
<span id="L1287" rel="#L1287">1287</span>
<span id="L1288" rel="#L1288">1288</span>
<span id="L1289" rel="#L1289">1289</span>
<span id="L1290" rel="#L1290">1290</span>
<span id="L1291" rel="#L1291">1291</span>
<span id="L1292" rel="#L1292">1292</span>
<span id="L1293" rel="#L1293">1293</span>
<span id="L1294" rel="#L1294">1294</span>
<span id="L1295" rel="#L1295">1295</span>
<span id="L1296" rel="#L1296">1296</span>
<span id="L1297" rel="#L1297">1297</span>
<span id="L1298" rel="#L1298">1298</span>
<span id="L1299" rel="#L1299">1299</span>
<span id="L1300" rel="#L1300">1300</span>
<span id="L1301" rel="#L1301">1301</span>
<span id="L1302" rel="#L1302">1302</span>
<span id="L1303" rel="#L1303">1303</span>
<span id="L1304" rel="#L1304">1304</span>
<span id="L1305" rel="#L1305">1305</span>
<span id="L1306" rel="#L1306">1306</span>
<span id="L1307" rel="#L1307">1307</span>
<span id="L1308" rel="#L1308">1308</span>
<span id="L1309" rel="#L1309">1309</span>
<span id="L1310" rel="#L1310">1310</span>
<span id="L1311" rel="#L1311">1311</span>
<span id="L1312" rel="#L1312">1312</span>
<span id="L1313" rel="#L1313">1313</span>
<span id="L1314" rel="#L1314">1314</span>
<span id="L1315" rel="#L1315">1315</span>
<span id="L1316" rel="#L1316">1316</span>
<span id="L1317" rel="#L1317">1317</span>
<span id="L1318" rel="#L1318">1318</span>
<span id="L1319" rel="#L1319">1319</span>
<span id="L1320" rel="#L1320">1320</span>
<span id="L1321" rel="#L1321">1321</span>
<span id="L1322" rel="#L1322">1322</span>
<span id="L1323" rel="#L1323">1323</span>
<span id="L1324" rel="#L1324">1324</span>
<span id="L1325" rel="#L1325">1325</span>
<span id="L1326" rel="#L1326">1326</span>
<span id="L1327" rel="#L1327">1327</span>
<span id="L1328" rel="#L1328">1328</span>
<span id="L1329" rel="#L1329">1329</span>
<span id="L1330" rel="#L1330">1330</span>
<span id="L1331" rel="#L1331">1331</span>
<span id="L1332" rel="#L1332">1332</span>
<span id="L1333" rel="#L1333">1333</span>
<span id="L1334" rel="#L1334">1334</span>
<span id="L1335" rel="#L1335">1335</span>
<span id="L1336" rel="#L1336">1336</span>
<span id="L1337" rel="#L1337">1337</span>
<span id="L1338" rel="#L1338">1338</span>
<span id="L1339" rel="#L1339">1339</span>
<span id="L1340" rel="#L1340">1340</span>
<span id="L1341" rel="#L1341">1341</span>
<span id="L1342" rel="#L1342">1342</span>
<span id="L1343" rel="#L1343">1343</span>
<span id="L1344" rel="#L1344">1344</span>
<span id="L1345" rel="#L1345">1345</span>
<span id="L1346" rel="#L1346">1346</span>
<span id="L1347" rel="#L1347">1347</span>
<span id="L1348" rel="#L1348">1348</span>
<span id="L1349" rel="#L1349">1349</span>
<span id="L1350" rel="#L1350">1350</span>
<span id="L1351" rel="#L1351">1351</span>
<span id="L1352" rel="#L1352">1352</span>
<span id="L1353" rel="#L1353">1353</span>
<span id="L1354" rel="#L1354">1354</span>
<span id="L1355" rel="#L1355">1355</span>
<span id="L1356" rel="#L1356">1356</span>
<span id="L1357" rel="#L1357">1357</span>
<span id="L1358" rel="#L1358">1358</span>
<span id="L1359" rel="#L1359">1359</span>
<span id="L1360" rel="#L1360">1360</span>
<span id="L1361" rel="#L1361">1361</span>
<span id="L1362" rel="#L1362">1362</span>
<span id="L1363" rel="#L1363">1363</span>
<span id="L1364" rel="#L1364">1364</span>
<span id="L1365" rel="#L1365">1365</span>
<span id="L1366" rel="#L1366">1366</span>
<span id="L1367" rel="#L1367">1367</span>
<span id="L1368" rel="#L1368">1368</span>
<span id="L1369" rel="#L1369">1369</span>
<span id="L1370" rel="#L1370">1370</span>
<span id="L1371" rel="#L1371">1371</span>
<span id="L1372" rel="#L1372">1372</span>
<span id="L1373" rel="#L1373">1373</span>
<span id="L1374" rel="#L1374">1374</span>
<span id="L1375" rel="#L1375">1375</span>
<span id="L1376" rel="#L1376">1376</span>
<span id="L1377" rel="#L1377">1377</span>
<span id="L1378" rel="#L1378">1378</span>
<span id="L1379" rel="#L1379">1379</span>
<span id="L1380" rel="#L1380">1380</span>
<span id="L1381" rel="#L1381">1381</span>
<span id="L1382" rel="#L1382">1382</span>
<span id="L1383" rel="#L1383">1383</span>
<span id="L1384" rel="#L1384">1384</span>
<span id="L1385" rel="#L1385">1385</span>
<span id="L1386" rel="#L1386">1386</span>
<span id="L1387" rel="#L1387">1387</span>
<span id="L1388" rel="#L1388">1388</span>
<span id="L1389" rel="#L1389">1389</span>
<span id="L1390" rel="#L1390">1390</span>
<span id="L1391" rel="#L1391">1391</span>
<span id="L1392" rel="#L1392">1392</span>
<span id="L1393" rel="#L1393">1393</span>
<span id="L1394" rel="#L1394">1394</span>
<span id="L1395" rel="#L1395">1395</span>
<span id="L1396" rel="#L1396">1396</span>
<span id="L1397" rel="#L1397">1397</span>
<span id="L1398" rel="#L1398">1398</span>
<span id="L1399" rel="#L1399">1399</span>
<span id="L1400" rel="#L1400">1400</span>
<span id="L1401" rel="#L1401">1401</span>
<span id="L1402" rel="#L1402">1402</span>
<span id="L1403" rel="#L1403">1403</span>
<span id="L1404" rel="#L1404">1404</span>
<span id="L1405" rel="#L1405">1405</span>
<span id="L1406" rel="#L1406">1406</span>
<span id="L1407" rel="#L1407">1407</span>
<span id="L1408" rel="#L1408">1408</span>
<span id="L1409" rel="#L1409">1409</span>

            </td>
            <td class="blob-line-code">
                    <div class="code-body highlight"><pre><div class='line' id='LC1'><span class="cm">/*</span></div><div class='line' id='LC2'><span class="cm"> * Copyright 2012 - 2013 Roman Nurik, Jake Wharton, Tim Roes</span></div><div class='line' id='LC3'><span class="cm"> *</span></div><div class='line' id='LC4'><span class="cm"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);</span></div><div class='line' id='LC5'><span class="cm"> * you may not use this file except in compliance with the License.</span></div><div class='line' id='LC6'><span class="cm"> * You may obtain a copy of the License at</span></div><div class='line' id='LC7'><span class="cm"> *</span></div><div class='line' id='LC8'><span class="cm"> *     http://www.apache.org/licenses/LICENSE-2.0</span></div><div class='line' id='LC9'><span class="cm"> *</span></div><div class='line' id='LC10'><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></div><div class='line' id='LC11'><span class="cm"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></div><div class='line' id='LC12'><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></div><div class='line' id='LC13'><span class="cm"> * See the License for the specific language governing permissions and</span></div><div class='line' id='LC14'><span class="cm"> * limitations under the License.</span></div><div class='line' id='LC15'><span class="cm"> */</span></div><div class='line' id='LC16'><span class="kn">package</span> <span class="n">de</span><span class="o">.</span><span class="na">timroes</span><span class="o">.</span><span class="na">android</span><span class="o">.</span><span class="na">listview</span><span class="o">;</span></div><div class='line' id='LC17'><br/></div><div class='line' id='LC18'><span class="kn">import</span> <span class="nn">android.content.Context</span><span class="o">;</span></div><div class='line' id='LC19'><span class="kn">import</span> <span class="nn">android.graphics.Bitmap</span><span class="o">;</span></div><div class='line' id='LC20'><span class="kn">import</span> <span class="nn">android.graphics.Canvas</span><span class="o">;</span></div><div class='line' id='LC21'><span class="kn">import</span> <span class="nn">android.graphics.Color</span><span class="o">;</span></div><div class='line' id='LC22'><span class="kn">import</span> <span class="nn">android.graphics.Paint</span><span class="o">;</span></div><div class='line' id='LC23'><span class="kn">import</span> <span class="nn">android.graphics.Rect</span><span class="o">;</span></div><div class='line' id='LC24'><span class="kn">import</span> <span class="nn">android.graphics.drawable.BitmapDrawable</span><span class="o">;</span></div><div class='line' id='LC25'><span class="kn">import</span> <span class="nn">android.os.Build</span><span class="o">;</span></div><div class='line' id='LC26'><span class="kn">import</span> <span class="nn">android.os.Handler</span><span class="o">;</span></div><div class='line' id='LC27'><span class="kn">import</span> <span class="nn">android.os.Message</span><span class="o">;</span></div><div class='line' id='LC28'><span class="kn">import</span> <span class="nn">android.util.AttributeSet</span><span class="o">;</span></div><div class='line' id='LC29'><span class="kn">import</span> <span class="nn">android.util.DisplayMetrics</span><span class="o">;</span></div><div class='line' id='LC30'><span class="kn">import</span> <span class="nn">android.view.Gravity</span><span class="o">;</span></div><div class='line' id='LC31'><span class="kn">import</span> <span class="nn">android.view.LayoutInflater</span><span class="o">;</span></div><div class='line' id='LC32'><span class="kn">import</span> <span class="nn">android.view.MotionEvent</span><span class="o">;</span></div><div class='line' id='LC33'><span class="kn">import</span> <span class="nn">android.view.VelocityTracker</span><span class="o">;</span></div><div class='line' id='LC34'><span class="kn">import</span> <span class="nn">android.view.View</span><span class="o">;</span></div><div class='line' id='LC35'><span class="kn">import</span> <span class="nn">android.view.ViewConfiguration</span><span class="o">;</span></div><div class='line' id='LC36'><span class="kn">import</span> <span class="nn">android.view.ViewGroup</span><span class="o">;</span></div><div class='line' id='LC37'><span class="kn">import</span> <span class="nn">android.view.ViewTreeObserver</span><span class="o">;</span></div><div class='line' id='LC38'><span class="kn">import</span> <span class="nn">android.widget.AbsListView</span><span class="o">;</span></div><div class='line' id='LC39'><span class="kn">import</span> <span class="nn">android.widget.AdapterView</span><span class="o">;</span></div><div class='line' id='LC40'><span class="kn">import</span> <span class="nn">android.widget.BaseAdapter</span><span class="o">;</span></div><div class='line' id='LC41'><span class="kn">import</span> <span class="nn">android.widget.Button</span><span class="o">;</span></div><div class='line' id='LC42'><span class="kn">import</span> <span class="nn">android.widget.ListAdapter</span><span class="o">;</span></div><div class='line' id='LC43'><span class="kn">import</span> <span class="nn">android.widget.ListView</span><span class="o">;</span></div><div class='line' id='LC44'><span class="kn">import</span> <span class="nn">android.widget.PopupWindow</span><span class="o">;</span></div><div class='line' id='LC45'><span class="kn">import</span> <span class="nn">android.widget.TextView</span><span class="o">;</span></div><div class='line' id='LC46'><br/></div><div class='line' id='LC47'><span class="kn">import</span> <span class="nn">com.nineoldandroids.animation.Animator</span><span class="o">;</span></div><div class='line' id='LC48'><span class="kn">import</span> <span class="nn">com.nineoldandroids.animation.AnimatorListenerAdapter</span><span class="o">;</span></div><div class='line' id='LC49'><span class="kn">import</span> <span class="nn">com.nineoldandroids.animation.ObjectAnimator</span><span class="o">;</span></div><div class='line' id='LC50'><span class="kn">import</span> <span class="nn">com.nineoldandroids.animation.PropertyValuesHolder</span><span class="o">;</span></div><div class='line' id='LC51'><span class="kn">import</span> <span class="nn">com.nineoldandroids.animation.TypeEvaluator</span><span class="o">;</span></div><div class='line' id='LC52'><span class="kn">import</span> <span class="nn">com.nineoldandroids.animation.ValueAnimator</span><span class="o">;</span></div><div class='line' id='LC53'><span class="kn">import</span> <span class="nn">com.nineoldandroids.view.ViewHelper</span><span class="o">;</span></div><div class='line' id='LC54'><span class="kn">import</span> <span class="nn">com.nineoldandroids.view.ViewPropertyAnimator</span><span class="o">;</span></div><div class='line' id='LC55'><br/></div><div class='line' id='LC56'><span class="kn">import</span> <span class="nn">java.util.ArrayList</span><span class="o">;</span></div><div class='line' id='LC57'><span class="kn">import</span> <span class="nn">java.util.Collections</span><span class="o">;</span></div><div class='line' id='LC58'><span class="kn">import</span> <span class="nn">java.util.LinkedList</span><span class="o">;</span></div><div class='line' id='LC59'><span class="kn">import</span> <span class="nn">java.util.List</span><span class="o">;</span></div><div class='line' id='LC60'><span class="kn">import</span> <span class="nn">java.util.SortedSet</span><span class="o">;</span></div><div class='line' id='LC61'><span class="kn">import</span> <span class="nn">java.util.TreeSet</span><span class="o">;</span></div><div class='line' id='LC62'><br/></div><div class='line' id='LC63'><span class="cm">/**</span></div><div class='line' id='LC64'><span class="cm"> * A {@link android.widget.ListView} offering enhanced features like Swipe To Dismiss and an</span></div><div class='line' id='LC65'><span class="cm"> * undo functionality. See the documentation on GitHub for more information.</span></div><div class='line' id='LC66'><span class="cm"> *</span></div><div class='line' id='LC67'><span class="cm"> * @author Tim Roes &lt;mail@timroes.de&gt;</span></div><div class='line' id='LC68'><span class="cm"> */</span></div><div class='line' id='LC69'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">EnhancedListView</span> <span class="kd">extends</span> <span class="n">ListView</span> <span class="o">{</span></div><div class='line' id='LC70'><br/></div><div class='line' id='LC71'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC72'><span class="cm">     * Defines the style in which &lt;i&gt;undos&lt;/i&gt; should be displayed and handled in the list.</span></div><div class='line' id='LC73'><span class="cm">     * Pass this to {@link #setUndoStyle(de.timroes.android.listview.EnhancedListView.UndoStyle)}</span></div><div class='line' id='LC74'><span class="cm">     * to change the default behavior from {@link #SINGLE_POPUP}.</span></div><div class='line' id='LC75'><span class="cm">     */</span></div><div class='line' id='LC76'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">enum</span> <span class="n">UndoStyle</span> <span class="o">{</span></div><div class='line' id='LC77'><br/></div><div class='line' id='LC78'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC79'><span class="cm">         * Shows a popup window, that allows the user to undo the last</span></div><div class='line' id='LC80'><span class="cm">         * dismiss. If another element is deleted, the undo popup will undo that deletion.</span></div><div class='line' id='LC81'><span class="cm">         * The user is only able to undo the last deletion.</span></div><div class='line' id='LC82'><span class="cm">         */</span></div><div class='line' id='LC83'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">SINGLE_POPUP</span><span class="o">,</span></div><div class='line' id='LC84'><br/></div><div class='line' id='LC85'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC86'><span class="cm">         * Shows a popup window, that allows the user to undo the last dismiss.</span></div><div class='line' id='LC87'><span class="cm">         * If another item is deleted, this will be added to the chain of undos. So pressing</span></div><div class='line' id='LC88'><span class="cm">         * undo will undo the last deletion, pressing it again will undo the deletion before that,</span></div><div class='line' id='LC89'><span class="cm">         * and so on. As soon as the popup vanished (e.g. because {@link #setUndoHideDelay(int) autoHideDelay}</span></div><div class='line' id='LC90'><span class="cm">         * is over) all saved undos will be discarded.</span></div><div class='line' id='LC91'><span class="cm">         */</span></div><div class='line' id='LC92'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">MULTILEVEL_POPUP</span><span class="o">,</span></div><div class='line' id='LC93'><br/></div><div class='line' id='LC94'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC95'><span class="cm">         * Shows a popup window, that allows the user to undo the last dismisses.</span></div><div class='line' id='LC96'><span class="cm">         * If another item is deleted, while there is still an undo popup visible, the label</span></div><div class='line' id='LC97'><span class="cm">         * of the button changes to &lt;i&gt;Undo all&lt;/i&gt; and a press on the button, will discard</span></div><div class='line' id='LC98'><span class="cm">         * all stored undos. As soon as the popup vanished (e.g. because {@link #setUndoHideDelay(int) autoHideDelay}</span></div><div class='line' id='LC99'><span class="cm">         * is over) all saved undos will be discarded.</span></div><div class='line' id='LC100'><span class="cm">         */</span></div><div class='line' id='LC101'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">COLLAPSED_POPUP</span></div><div class='line' id='LC102'><br/></div><div class='line' id='LC103'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC104'><br/></div><div class='line' id='LC105'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC106'><span class="cm">     * Defines the direction in which list items can be swiped out to delete them.</span></div><div class='line' id='LC107'><span class="cm">     * Use {@link #setSwipeDirection(de.timroes.android.listview.EnhancedListView.SwipeDirection)}</span></div><div class='line' id='LC108'><span class="cm">     * to change the default behavior.</span></div><div class='line' id='LC109'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC110'><span class="cm">     * &lt;b&gt;Note:&lt;/b&gt; This method requires the &lt;i&gt;Swipe to Dismiss&lt;/i&gt; feature enabled. Use</span></div><div class='line' id='LC111'><span class="cm">     * {@link #enableSwipeToDismiss()}</span></div><div class='line' id='LC112'><span class="cm">     * to enable the feature.</span></div><div class='line' id='LC113'><span class="cm">     */</span></div><div class='line' id='LC114'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">enum</span> <span class="n">SwipeDirection</span> <span class="o">{</span></div><div class='line' id='LC115'><br/></div><div class='line' id='LC116'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC117'><span class="cm">         * The user can swipe each item into both directions (left and right) to delete it.</span></div><div class='line' id='LC118'><span class="cm">         */</span></div><div class='line' id='LC119'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">BOTH</span><span class="o">,</span></div><div class='line' id='LC120'><br/></div><div class='line' id='LC121'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC122'><span class="cm">         * The user can only swipe the items to the beginning of the item to</span></div><div class='line' id='LC123'><span class="cm">         * delete it. The start of an item is in Left-To-Right languages the left</span></div><div class='line' id='LC124'><span class="cm">         * side and in Right-To-Left languages the right side. Before API level</span></div><div class='line' id='LC125'><span class="cm">         * 17 this is always the left side.</span></div><div class='line' id='LC126'><span class="cm">         */</span></div><div class='line' id='LC127'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">START</span><span class="o">,</span></div><div class='line' id='LC128'><br/></div><div class='line' id='LC129'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC130'><span class="cm">         * The user can only swipe the items to the end of the item to delete it.</span></div><div class='line' id='LC131'><span class="cm">         * This is in Left-To-Right languages the right side in Right-To-Left</span></div><div class='line' id='LC132'><span class="cm">         * languages the left side. Before API level 17 this will always be the</span></div><div class='line' id='LC133'><span class="cm">         * right side.</span></div><div class='line' id='LC134'><span class="cm">         */</span></div><div class='line' id='LC135'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">END</span></div><div class='line' id='LC136'><br/></div><div class='line' id='LC137'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC138'><br/></div><div class='line' id='LC139'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC140'><span class="cm">     * The callback interface used by {@link #setDismissCallback(EnhancedListView.OnDismissCallback)}</span></div><div class='line' id='LC141'><span class="cm">     * to inform its client about a successful dismissal of one or more list item positions.</span></div><div class='line' id='LC142'><span class="cm">     * Implement this to remove items from your adapter, that has been swiped from the list.</span></div><div class='line' id='LC143'><span class="cm">     */</span></div><div class='line' id='LC144'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">interface</span> <span class="nc">OnDismissCallback</span> <span class="o">{</span></div><div class='line' id='LC145'><br/></div><div class='line' id='LC146'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC147'><span class="cm">         * Called when the user has deleted an item from the list. The item has been deleted from</span></div><div class='line' id='LC148'><span class="cm">         * the {@code listView} at {@code position}. Delete this item from your adapter.</span></div><div class='line' id='LC149'><span class="cm">         * &lt;p&gt;</span></div><div class='line' id='LC150'><span class="cm">         * Don&#39;t return from this method, before your item has been deleted from the adapter, meaning</span></div><div class='line' id='LC151'><span class="cm">         * if you delete the item in another thread, you have to make sure, you don&#39;t return from</span></div><div class='line' id='LC152'><span class="cm">         * this method, before the item has been deleted. Since the way how you delete your item</span></div><div class='line' id='LC153'><span class="cm">         * depends on your data and adapter, the {@link de.timroes.android.listview.EnhancedListView}</span></div><div class='line' id='LC154'><span class="cm">         * cannot handle that synchronizing for you. If you return from this method before you removed</span></div><div class='line' id='LC155'><span class="cm">         * the view from the adapter, you will most likely get errors like exceptions and flashing</span></div><div class='line' id='LC156'><span class="cm">         * items in the list.</span></div><div class='line' id='LC157'><span class="cm">         * &lt;p&gt;</span></div><div class='line' id='LC158'><span class="cm">         * If the user should get the possibility to undo this deletion, return an implementation</span></div><div class='line' id='LC159'><span class="cm">         * of {@link de.timroes.android.listview.EnhancedListView.Undoable} from this method.</span></div><div class='line' id='LC160'><span class="cm">         * If you return {@code null} no undo will be possible. You are free to return an {@code Undoable}</span></div><div class='line' id='LC161'><span class="cm">         * for some items, and {@code null} for others, though it might be a horrible user experience.</span></div><div class='line' id='LC162'><span class="cm">         *</span></div><div class='line' id='LC163'><span class="cm">         * @param listView The {@link EnhancedListView} the item has been deleted from.</span></div><div class='line' id='LC164'><span class="cm">         * @param position The position of the item to delete from your adapter.</span></div><div class='line' id='LC165'><span class="cm">         * @return An {@link de.timroes.android.listview.EnhancedListView.Undoable}, if you want</span></div><div class='line' id='LC166'><span class="cm">         *      to give the user the possibility to undo the deletion.</span></div><div class='line' id='LC167'><span class="cm">         */</span></div><div class='line' id='LC168'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Undoable</span> <span class="nf">onDismiss</span><span class="o">(</span><span class="n">EnhancedListView</span> <span class="n">listView</span><span class="o">,</span> <span class="kt">int</span> <span class="n">position</span><span class="o">);</span></div><div class='line' id='LC169'><br/></div><div class='line' id='LC170'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC171'><br/></div><div class='line' id='LC172'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC173'><span class="cm">     * Extend this abstract class and return it from</span></div><div class='line' id='LC174'><span class="cm">     * {@link EnhancedListView.OnDismissCallback#onDismiss(EnhancedListView, int)}</span></div><div class='line' id='LC175'><span class="cm">     * to let the user undo the deletion you&#39;ve done with your {@link EnhancedListView.OnDismissCallback}.</span></div><div class='line' id='LC176'><span class="cm">     * You have at least to implement the {@link #undo()} method, and can override {@link #discard()}</span></div><div class='line' id='LC177'><span class="cm">     * and {@link #getTitle()} to offer more functionality. See the README file for example implementations.</span></div><div class='line' id='LC178'><span class="cm">     */</span></div><div class='line' id='LC179'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">abstract</span> <span class="kd">static</span> <span class="kd">class</span> <span class="nc">Undoable</span> <span class="o">{</span></div><div class='line' id='LC180'><br/></div><div class='line' id='LC181'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC182'><span class="cm">         * This method must undo the deletion you&#39;ve done in</span></div><div class='line' id='LC183'><span class="cm">         * {@link EnhancedListView.OnDismissCallback#onDismiss(EnhancedListView, int)} and reinsert</span></div><div class='line' id='LC184'><span class="cm">         * the element into the adapter.</span></div><div class='line' id='LC185'><span class="cm">         * &lt;p&gt;</span></div><div class='line' id='LC186'><span class="cm">         * In the most implementations, you will only remove the list item from your adapter</span></div><div class='line' id='LC187'><span class="cm">         * in the {@code onDismiss} method and delete it from the database (or your permanent</span></div><div class='line' id='LC188'><span class="cm">         * storage) in {@link #discard()}. In that case you only need to reinsert the item</span></div><div class='line' id='LC189'><span class="cm">         * to the adapter.</span></div><div class='line' id='LC190'><span class="cm">         */</span></div><div class='line' id='LC191'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">undo</span><span class="o">();</span></div><div class='line' id='LC192'><br/></div><div class='line' id='LC193'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC194'><span class="cm">         * Returns the individual undo message for this undo. This will be displayed in the undo</span></div><div class='line' id='LC195'><span class="cm">         * window, beside the undo button. The default implementation returns {@code null},</span></div><div class='line' id='LC196'><span class="cm">         * what will lead in a default message to be displayed in the undo window.</span></div><div class='line' id='LC197'><span class="cm">         * Don&#39;t call the super method, when overriding this method.</span></div><div class='line' id='LC198'><span class="cm">         *</span></div><div class='line' id='LC199'><span class="cm">         * @return The title for a special string.</span></div><div class='line' id='LC200'><span class="cm">         */</span></div><div class='line' id='LC201'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">String</span> <span class="nf">getTitle</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC202'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC203'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC204'><br/></div><div class='line' id='LC205'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC206'><span class="cm">         * Discard the undo, meaning the user has no longer the possibility to undo the deletion.</span></div><div class='line' id='LC207'><span class="cm">         * Implement this, to finally delete your stuff from permanent storages like databases</span></div><div class='line' id='LC208'><span class="cm">         * (whereas in {@link de.timroes.android.listview.EnhancedListView.OnDismissCallback#onKeyDown(int, android.view.KeyEvent)}</span></div><div class='line' id='LC209'><span class="cm">         * you should only remove it from the list adapter).</span></div><div class='line' id='LC210'><span class="cm">         */</span></div><div class='line' id='LC211'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">discard</span><span class="o">()</span> <span class="o">{</span> <span class="o">}</span></div><div class='line' id='LC212'><br/></div><div class='line' id='LC213'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC214'><br/></div><div class='line' id='LC215'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">class</span> <span class="nc">PendingDismissData</span> <span class="kd">implements</span> <span class="n">Comparable</span><span class="o">&lt;</span><span class="n">PendingDismissData</span><span class="o">&gt;</span> <span class="o">{</span></div><div class='line' id='LC216'><br/></div><div class='line' id='LC217'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="n">position</span><span class="o">;</span></div><div class='line' id='LC218'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC219'><span class="cm">         * The view that should get swiped out.</span></div><div class='line' id='LC220'><span class="cm">         */</span></div><div class='line' id='LC221'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">View</span> <span class="n">view</span><span class="o">;</span></div><div class='line' id='LC222'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC223'><span class="cm">         * The whole list item view.</span></div><div class='line' id='LC224'><span class="cm">         */</span></div><div class='line' id='LC225'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">View</span> <span class="n">childView</span><span class="o">;</span></div><div class='line' id='LC226'><br/></div><div class='line' id='LC227'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">PendingDismissData</span><span class="o">(</span><span class="kt">int</span> <span class="n">position</span><span class="o">,</span> <span class="n">View</span> <span class="n">view</span><span class="o">,</span> <span class="n">View</span> <span class="n">childView</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC228'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">position</span> <span class="o">=</span> <span class="n">position</span><span class="o">;</span></div><div class='line' id='LC229'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">view</span> <span class="o">=</span> <span class="n">view</span><span class="o">;</span></div><div class='line' id='LC230'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">childView</span> <span class="o">=</span> <span class="n">childView</span><span class="o">;</span></div><div class='line' id='LC231'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC232'><br/></div><div class='line' id='LC233'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC234'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">compareTo</span><span class="o">(</span><span class="n">PendingDismissData</span> <span class="n">other</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC235'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Sort by descending position</span></div><div class='line' id='LC236'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">other</span><span class="o">.</span><span class="na">position</span> <span class="o">-</span> <span class="n">position</span><span class="o">;</span></div><div class='line' id='LC237'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC238'><br/></div><div class='line' id='LC239'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC240'><br/></div><div class='line' id='LC241'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">class</span> <span class="nc">UndoClickListener</span> <span class="kd">implements</span> <span class="n">OnClickListener</span> <span class="o">{</span></div><div class='line' id='LC242'><br/></div><div class='line' id='LC243'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC244'><span class="cm">         * Called when a view has been clicked.</span></div><div class='line' id='LC245'><span class="cm">         *</span></div><div class='line' id='LC246'><span class="cm">         * @param v The view that was clicked.</span></div><div class='line' id='LC247'><span class="cm">         */</span></div><div class='line' id='LC248'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC249'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onClick</span><span class="o">(</span><span class="n">View</span> <span class="n">v</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC250'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(!</span><span class="n">mUndoActions</span><span class="o">.</span><span class="na">isEmpty</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC251'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">switch</span><span class="o">(</span><span class="n">mUndoStyle</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC252'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="nl">SINGLE_POPUP:</span></div><div class='line' id='LC253'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoActions</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">undo</span><span class="o">();</span></div><div class='line' id='LC254'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoActions</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></div><div class='line' id='LC255'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC256'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="nl">COLLAPSED_POPUP:</span></div><div class='line' id='LC257'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Collections</span><span class="o">.</span><span class="na">reverse</span><span class="o">(</span><span class="n">mUndoActions</span><span class="o">);</span></div><div class='line' id='LC258'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span><span class="o">(</span><span class="n">Undoable</span> <span class="n">undo</span> <span class="o">:</span> <span class="n">mUndoActions</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC259'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">undo</span><span class="o">.</span><span class="na">undo</span><span class="o">();</span></div><div class='line' id='LC260'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC261'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoActions</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></div><div class='line' id='LC262'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC263'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="nl">MULTILEVEL_POPUP:</span></div><div class='line' id='LC264'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoActions</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">mUndoActions</span><span class="o">.</span><span class="na">size</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">).</span><span class="na">undo</span><span class="o">();</span></div><div class='line' id='LC265'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoActions</span><span class="o">.</span><span class="na">remove</span><span class="o">(</span><span class="n">mUndoActions</span><span class="o">.</span><span class="na">size</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC266'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC267'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC268'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC269'><br/></div><div class='line' id='LC270'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Dismiss dialog or change text</span></div><div class='line' id='LC271'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mUndoActions</span><span class="o">.</span><span class="na">isEmpty</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC272'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopup</span><span class="o">.</span><span class="na">dismiss</span><span class="o">();</span></div><div class='line' id='LC273'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC274'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">changePopupText</span><span class="o">();</span></div><div class='line' id='LC275'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">changeButtonLabel</span><span class="o">();</span></div><div class='line' id='LC276'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC277'><br/></div><div class='line' id='LC278'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mValidDelayedMsgId</span><span class="o">++;</span></div><div class='line' id='LC279'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC280'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC281'><br/></div><div class='line' id='LC282'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">class</span> <span class="nc">HideUndoPopupHandler</span> <span class="kd">extends</span> <span class="n">Handler</span> <span class="o">{</span></div><div class='line' id='LC283'><br/></div><div class='line' id='LC284'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC285'><span class="cm">         * Subclasses must implement this to receive messages.</span></div><div class='line' id='LC286'><span class="cm">         */</span></div><div class='line' id='LC287'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC288'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">handleMessage</span><span class="o">(</span><span class="n">Message</span> <span class="n">msg</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC289'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">msg</span><span class="o">.</span><span class="na">what</span> <span class="o">==</span> <span class="n">mValidDelayedMsgId</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC290'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span><span class="o">(</span><span class="n">Undoable</span> <span class="n">undo</span> <span class="o">:</span> <span class="n">mUndoActions</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC291'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">undo</span><span class="o">.</span><span class="na">discard</span><span class="o">();</span></div><div class='line' id='LC292'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC293'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoActions</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></div><div class='line' id='LC294'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopup</span><span class="o">.</span><span class="na">dismiss</span><span class="o">();</span></div><div class='line' id='LC295'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC296'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC297'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC298'><br/></div><div class='line' id='LC299'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Cached ViewConfiguration and system-wide constant values</span></div><div class='line' id='LC300'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mSlop</span><span class="o">;</span></div><div class='line' id='LC301'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mMinFlingVelocity</span><span class="o">;</span></div><div class='line' id='LC302'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mMaxFlingVelocity</span><span class="o">;</span></div><div class='line' id='LC303'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">long</span> <span class="n">mAnimationTime</span><span class="o">;</span></div><div class='line' id='LC304'><br/></div><div class='line' id='LC305'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">final</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">mAnimationLock</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Object</span><span class="o">[</span><span class="mi">0</span><span class="o">];</span></div><div class='line' id='LC306'><br/></div><div class='line' id='LC307'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Swipe-To-Dismiss</span></div><div class='line' id='LC308'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">mSwipeEnabled</span><span class="o">;</span></div><div class='line' id='LC309'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">OnDismissCallback</span> <span class="n">mDismissCallback</span><span class="o">;</span></div><div class='line' id='LC310'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">UndoStyle</span> <span class="n">mUndoStyle</span> <span class="o">=</span> <span class="n">UndoStyle</span><span class="o">.</span><span class="na">SINGLE_POPUP</span><span class="o">;</span></div><div class='line' id='LC311'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">mTouchBeforeAutoHide</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC312'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">SwipeDirection</span> <span class="n">mSwipeDirection</span> <span class="o">=</span> <span class="n">SwipeDirection</span><span class="o">.</span><span class="na">BOTH</span><span class="o">;</span></div><div class='line' id='LC313'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mUndoHideDelay</span> <span class="o">=</span> <span class="mi">5000</span><span class="o">;</span></div><div class='line' id='LC314'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mSwipingLayout</span><span class="o">;</span></div><div class='line' id='LC315'><br/></div><div class='line' id='LC316'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">Undoable</span><span class="o">&gt;</span> <span class="n">mUndoActions</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">Undoable</span><span class="o">&gt;();</span></div><div class='line' id='LC317'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">SortedSet</span><span class="o">&lt;</span><span class="n">PendingDismissData</span><span class="o">&gt;</span> <span class="n">mPendingDismisses</span> <span class="o">=</span> <span class="k">new</span> <span class="n">TreeSet</span><span class="o">&lt;</span><span class="n">PendingDismissData</span><span class="o">&gt;();</span></div><div class='line' id='LC318'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">View</span><span class="o">&gt;</span> <span class="n">mAnimatedViews</span> <span class="o">=</span> <span class="k">new</span> <span class="n">LinkedList</span><span class="o">&lt;</span><span class="n">View</span><span class="o">&gt;();</span></div><div class='line' id='LC319'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mDismissAnimationRefCount</span><span class="o">;</span></div><div class='line' id='LC320'><br/></div><div class='line' id='LC321'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">mSwipePaused</span><span class="o">;</span></div><div class='line' id='LC322'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">mSwiping</span><span class="o">;</span></div><div class='line' id='LC323'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mViewWidth</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span> <span class="c1">// 1 and not 0 to prevent dividing by zero</span></div><div class='line' id='LC324'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">View</span> <span class="n">mSwipeDownView</span><span class="o">;</span></div><div class='line' id='LC325'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">View</span> <span class="n">mSwipeDownChild</span><span class="o">;</span></div><div class='line' id='LC326'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">TextView</span> <span class="n">mUndoPopupTextView</span><span class="o">;</span></div><div class='line' id='LC327'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">VelocityTracker</span> <span class="n">mVelocityTracker</span><span class="o">;</span></div><div class='line' id='LC328'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">float</span> <span class="n">mDownX</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC329'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mDownPosition</span><span class="o">;</span></div><div class='line' id='LC330'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">float</span> <span class="n">mScreenDensity</span><span class="o">;</span></div><div class='line' id='LC331'><br/></div><div class='line' id='LC332'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">PopupWindow</span> <span class="n">mUndoPopup</span><span class="o">;</span></div><div class='line' id='LC333'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mValidDelayedMsgId</span><span class="o">;</span></div><div class='line' id='LC334'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">Handler</span> <span class="n">mHideUndoHandler</span> <span class="o">=</span> <span class="k">new</span> <span class="n">HideUndoPopupHandler</span><span class="o">();</span></div><div class='line' id='LC335'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">Button</span> <span class="n">mUndoButton</span><span class="o">;</span></div><div class='line' id='LC336'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// END Swipe-To-Dismiss</span></div><div class='line' id='LC337'><br/></div><div class='line' id='LC338'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// START Drag-And-Drop</span></div><div class='line' id='LC339'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">mRearrangingEnabled</span><span class="o">;</span></div><div class='line' id='LC340'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">SMOOTH_SCROLL_AMOUNT_AT_EDGE</span> <span class="o">=</span> <span class="mi">15</span><span class="o">;</span></div><div class='line' id='LC341'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">MOVE_DURATION</span> <span class="o">=</span> <span class="mi">150</span><span class="o">;</span></div><div class='line' id='LC342'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">LINE_THICKNESS</span> <span class="o">=</span> <span class="mi">15</span><span class="o">;</span></div><div class='line' id='LC343'><br/></div><div class='line' id='LC344'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mLastEventY</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC345'><br/></div><div class='line' id='LC346'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mDownY</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC347'><br/></div><div class='line' id='LC348'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mTotalOffset</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC349'><br/></div><div class='line' id='LC350'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">mCellIsMobile</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC351'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">mIsMobileScrolling</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC352'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mSmoothScrollAmountAtEdge</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC353'><br/></div><div class='line' id='LC354'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">INVALID_ID</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC355'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">long</span> <span class="n">mAboveItemId</span> <span class="o">=</span> <span class="n">INVALID_ID</span><span class="o">;</span></div><div class='line' id='LC356'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">long</span> <span class="n">mMobileItemId</span> <span class="o">=</span> <span class="n">INVALID_ID</span><span class="o">;</span></div><div class='line' id='LC357'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">long</span> <span class="n">mBelowItemId</span> <span class="o">=</span> <span class="n">INVALID_ID</span><span class="o">;</span></div><div class='line' id='LC358'><br/></div><div class='line' id='LC359'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">BitmapDrawable</span> <span class="n">mHoverCell</span><span class="o">;</span></div><div class='line' id='LC360'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">Rect</span> <span class="n">mHoverCellCurrentBounds</span><span class="o">;</span></div><div class='line' id='LC361'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">Rect</span> <span class="n">mHoverCellOriginalBounds</span><span class="o">;</span></div><div class='line' id='LC362'><br/></div><div class='line' id='LC363'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">INVALID_POINTER_ID</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC364'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mActivePointerId</span> <span class="o">=</span> <span class="n">INVALID_POINTER_ID</span><span class="o">;</span></div><div class='line' id='LC365'><br/></div><div class='line' id='LC366'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">mIsWaitingForScrollFinish</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC367'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mScrollState</span> <span class="o">=</span> <span class="n">OnScrollListener</span><span class="o">.</span><span class="na">SCROLL_STATE_IDLE</span><span class="o">;</span></div><div class='line' id='LC368'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// END Drag-And-Drop</span></div><div class='line' id='LC369'><br/></div><div class='line' id='LC370'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC371'><span class="cm">     * {@inheritDoc}</span></div><div class='line' id='LC372'><span class="cm">     */</span></div><div class='line' id='LC373'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">EnhancedListView</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC374'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">super</span><span class="o">(</span><span class="n">context</span><span class="o">);</span></div><div class='line' id='LC375'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">init</span><span class="o">(</span><span class="n">context</span><span class="o">);</span></div><div class='line' id='LC376'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC377'><br/></div><div class='line' id='LC378'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC379'><span class="cm">     * {@inheritDoc}</span></div><div class='line' id='LC380'><span class="cm">     */</span></div><div class='line' id='LC381'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">EnhancedListView</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span> <span class="n">AttributeSet</span> <span class="n">attrs</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC382'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">super</span><span class="o">(</span><span class="n">context</span><span class="o">,</span> <span class="n">attrs</span><span class="o">);</span></div><div class='line' id='LC383'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">init</span><span class="o">(</span><span class="n">context</span><span class="o">);</span></div><div class='line' id='LC384'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC385'><br/></div><div class='line' id='LC386'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC387'><span class="cm">     * {@inheritDoc}</span></div><div class='line' id='LC388'><span class="cm">     */</span></div><div class='line' id='LC389'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="nf">EnhancedListView</span><span class="o">(</span><span class="n">Context</span> <span class="n">context</span><span class="o">,</span> <span class="n">AttributeSet</span> <span class="n">attrs</span><span class="o">,</span> <span class="kt">int</span> <span class="n">defStyle</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC390'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">super</span><span class="o">(</span><span class="n">context</span><span class="o">,</span> <span class="n">attrs</span><span class="o">,</span> <span class="n">defStyle</span><span class="o">);</span></div><div class='line' id='LC391'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">init</span><span class="o">(</span><span class="n">context</span><span class="o">);</span></div><div class='line' id='LC392'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC393'><br/></div><div class='line' id='LC394'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">init</span><span class="o">(</span><span class="n">Context</span> <span class="n">ctx</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC395'><br/></div><div class='line' id='LC396'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">isInEditMode</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC397'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Skip initializing when in edit mode (IDE preview).</span></div><div class='line' id='LC398'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC399'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC400'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ViewConfiguration</span> <span class="n">vc</span> <span class="o">=</span><span class="n">ViewConfiguration</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">ctx</span><span class="o">);</span></div><div class='line' id='LC401'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSlop</span> <span class="o">=</span> <span class="n">vc</span><span class="o">.</span><span class="na">getScaledTouchSlop</span><span class="o">();</span></div><div class='line' id='LC402'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mMinFlingVelocity</span> <span class="o">=</span> <span class="n">vc</span><span class="o">.</span><span class="na">getScaledMinimumFlingVelocity</span><span class="o">();</span></div><div class='line' id='LC403'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mMaxFlingVelocity</span> <span class="o">=</span> <span class="n">vc</span><span class="o">.</span><span class="na">getScaledMaximumFlingVelocity</span><span class="o">();</span></div><div class='line' id='LC404'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAnimationTime</span> <span class="o">=</span> <span class="n">ctx</span><span class="o">.</span><span class="na">getResources</span><span class="o">().</span><span class="na">getInteger</span><span class="o">(</span></div><div class='line' id='LC405'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">android</span><span class="o">.</span><span class="na">R</span><span class="o">.</span><span class="na">integer</span><span class="o">.</span><span class="na">config_shortAnimTime</span><span class="o">);</span></div><div class='line' id='LC406'><br/></div><div class='line' id='LC407'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Initialize undo popup</span></div><div class='line' id='LC408'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">LayoutInflater</span> <span class="n">inflater</span> <span class="o">=</span> <span class="o">(</span><span class="n">LayoutInflater</span><span class="o">)</span><span class="n">getContext</span><span class="o">().</span><span class="na">getSystemService</span><span class="o">(</span><span class="n">Context</span><span class="o">.</span><span class="na">LAYOUT_INFLATER_SERVICE</span><span class="o">);</span></div><div class='line' id='LC409'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">undoView</span> <span class="o">=</span> <span class="n">inflater</span><span class="o">.</span><span class="na">inflate</span><span class="o">(</span><span class="n">R</span><span class="o">.</span><span class="na">layout</span><span class="o">.</span><span class="na">undo_popup</span><span class="o">,</span> <span class="kc">null</span><span class="o">);</span></div><div class='line' id='LC410'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoButton</span> <span class="o">=</span> <span class="o">(</span><span class="n">Button</span><span class="o">)</span><span class="n">undoView</span><span class="o">.</span><span class="na">findViewById</span><span class="o">(</span><span class="n">R</span><span class="o">.</span><span class="na">id</span><span class="o">.</span><span class="na">undo</span><span class="o">);</span></div><div class='line' id='LC411'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoButton</span><span class="o">.</span><span class="na">setOnClickListener</span><span class="o">(</span><span class="k">new</span> <span class="n">UndoClickListener</span><span class="o">());</span></div><div class='line' id='LC412'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoButton</span><span class="o">.</span><span class="na">setOnTouchListener</span><span class="o">(</span><span class="k">new</span> <span class="n">OnTouchListener</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC413'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC414'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">onTouch</span><span class="o">(</span><span class="n">View</span> <span class="n">v</span><span class="o">,</span> <span class="n">MotionEvent</span> <span class="n">event</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC415'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// If the user touches the screen invalidate the current running delay by incrementing</span></div><div class='line' id='LC416'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// the valid message id. So this delay won&#39;t hide the undo popup anymore</span></div><div class='line' id='LC417'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mValidDelayedMsgId</span><span class="o">++;</span></div><div class='line' id='LC418'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC419'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC420'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">});</span></div><div class='line' id='LC421'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopupTextView</span> <span class="o">=</span> <span class="o">(</span><span class="n">TextView</span><span class="o">)</span><span class="n">undoView</span><span class="o">.</span><span class="na">findViewById</span><span class="o">(</span><span class="n">R</span><span class="o">.</span><span class="na">id</span><span class="o">.</span><span class="na">text</span><span class="o">);</span></div><div class='line' id='LC422'><br/></div><div class='line' id='LC423'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopup</span> <span class="o">=</span> <span class="k">new</span> <span class="n">PopupWindow</span><span class="o">(</span><span class="n">undoView</span><span class="o">);</span></div><div class='line' id='LC424'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopup</span><span class="o">.</span><span class="na">setAnimationStyle</span><span class="o">(</span><span class="n">R</span><span class="o">.</span><span class="na">style</span><span class="o">.</span><span class="na">fade_animation</span><span class="o">);</span></div><div class='line' id='LC425'><br/></div><div class='line' id='LC426'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mScreenDensity</span> <span class="o">=</span> <span class="n">getResources</span><span class="o">().</span><span class="na">getDisplayMetrics</span><span class="o">().</span><span class="na">density</span><span class="o">;</span></div><div class='line' id='LC427'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopup</span><span class="o">.</span><span class="na">setHeight</span><span class="o">((</span><span class="kt">int</span><span class="o">)(</span><span class="n">mScreenDensity</span> <span class="o">*</span> <span class="mi">56</span><span class="o">));</span></div><div class='line' id='LC428'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// END initialize undo popup</span></div><div class='line' id='LC429'><br/></div><div class='line' id='LC430'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setOnScrollListener</span><span class="o">(</span><span class="n">mScrollListener</span><span class="o">);</span></div><div class='line' id='LC431'><br/></div><div class='line' id='LC432'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setOnItemLongClickListener</span><span class="o">(</span><span class="n">mOnItemLongClickListener</span><span class="o">);</span></div><div class='line' id='LC433'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">DisplayMetrics</span> <span class="n">metrics</span> <span class="o">=</span> <span class="n">ctx</span><span class="o">.</span><span class="na">getResources</span><span class="o">().</span><span class="na">getDisplayMetrics</span><span class="o">();</span></div><div class='line' id='LC434'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSmoothScrollAmountAtEdge</span> <span class="o">=</span> <span class="o">(</span><span class="kt">int</span><span class="o">)(</span><span class="n">SMOOTH_SCROLL_AMOUNT_AT_EDGE</span> <span class="o">/</span> <span class="n">metrics</span><span class="o">.</span><span class="na">density</span><span class="o">);</span></div><div class='line' id='LC435'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC436'><br/></div><div class='line' id='LC437'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC438'><span class="cm">     * Listens for long clicks on any items in the listview. When a cell has</span></div><div class='line' id='LC439'><span class="cm">     * been selected, the hover cell is created and set up.</span></div><div class='line' id='LC440'><span class="cm">     */</span></div><div class='line' id='LC441'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">AdapterView</span><span class="o">.</span><span class="na">OnItemLongClickListener</span> <span class="n">mOnItemLongClickListener</span> <span class="o">=</span></div><div class='line' id='LC442'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">new</span> <span class="n">AdapterView</span><span class="o">.</span><span class="na">OnItemLongClickListener</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC443'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">onItemLongClick</span><span class="o">(</span><span class="n">AdapterView</span><span class="o">&lt;?&gt;</span> <span class="n">arg0</span><span class="o">,</span> <span class="n">View</span> <span class="n">arg1</span><span class="o">,</span> <span class="kt">int</span> <span class="n">pos</span><span class="o">,</span> <span class="kt">long</span> <span class="n">id</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC444'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mTotalOffset</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC445'><br/></div><div class='line' id='LC446'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">position</span> <span class="o">=</span> <span class="n">pointToPosition</span><span class="o">((</span><span class="kt">int</span><span class="o">)</span><span class="n">mDownX</span><span class="o">,</span> <span class="n">mDownY</span><span class="o">);</span></div><div class='line' id='LC447'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">itemNum</span> <span class="o">=</span> <span class="n">position</span> <span class="o">-</span> <span class="n">getFirstVisiblePosition</span><span class="o">();</span></div><div class='line' id='LC448'><br/></div><div class='line' id='LC449'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">selectedView</span> <span class="o">=</span> <span class="n">getChildAt</span><span class="o">(</span><span class="n">itemNum</span><span class="o">);</span></div><div class='line' id='LC450'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mMobileItemId</span> <span class="o">=</span> <span class="n">getAdapter</span><span class="o">().</span><span class="na">getItemId</span><span class="o">(</span><span class="n">position</span><span class="o">);</span></div><div class='line' id='LC451'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCell</span> <span class="o">=</span> <span class="n">getAndAddHoverView</span><span class="o">(</span><span class="n">selectedView</span><span class="o">);</span></div><div class='line' id='LC452'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">selectedView</span><span class="o">.</span><span class="na">setVisibility</span><span class="o">(</span><span class="n">INVISIBLE</span><span class="o">);</span></div><div class='line' id='LC453'><br/></div><div class='line' id='LC454'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mCellIsMobile</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC455'><br/></div><div class='line' id='LC456'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">updateNeighborViewsForID</span><span class="o">(</span><span class="n">mMobileItemId</span><span class="o">);</span></div><div class='line' id='LC457'><br/></div><div class='line' id='LC458'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">((</span><span class="n">RearrangementListener</span><span class="o">)</span><span class="n">getAdapter</span><span class="o">()).</span><span class="na">onStartedRearranging</span><span class="o">();</span></div><div class='line' id='LC459'><br/></div><div class='line' id='LC460'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC461'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC462'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">};</span></div><div class='line' id='LC463'><br/></div><div class='line' id='LC464'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC465'><span class="cm">     * Creates the hover cell with the appropriate bitmap and of appropriate</span></div><div class='line' id='LC466'><span class="cm">     * size. The hover cell&#39;s BitmapDrawable is drawn on top of the bitmap every</span></div><div class='line' id='LC467'><span class="cm">     * single time an invalidate call is made.</span></div><div class='line' id='LC468'><span class="cm">     */</span></div><div class='line' id='LC469'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">BitmapDrawable</span> <span class="nf">getAndAddHoverView</span><span class="o">(</span><span class="n">View</span> <span class="n">v</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC470'><br/></div><div class='line' id='LC471'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">w</span> <span class="o">=</span> <span class="n">v</span><span class="o">.</span><span class="na">getWidth</span><span class="o">();</span></div><div class='line' id='LC472'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">h</span> <span class="o">=</span> <span class="n">v</span><span class="o">.</span><span class="na">getHeight</span><span class="o">();</span></div><div class='line' id='LC473'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">top</span> <span class="o">=</span> <span class="n">v</span><span class="o">.</span><span class="na">getTop</span><span class="o">();</span></div><div class='line' id='LC474'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">left</span> <span class="o">=</span> <span class="n">v</span><span class="o">.</span><span class="na">getLeft</span><span class="o">();</span></div><div class='line' id='LC475'><br/></div><div class='line' id='LC476'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bitmap</span> <span class="n">b</span> <span class="o">=</span> <span class="n">getBitmapWithBorder</span><span class="o">(</span><span class="n">v</span><span class="o">);</span></div><div class='line' id='LC477'><br/></div><div class='line' id='LC478'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">BitmapDrawable</span> <span class="n">drawable</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BitmapDrawable</span><span class="o">(</span><span class="n">getResources</span><span class="o">(),</span> <span class="n">b</span><span class="o">);</span></div><div class='line' id='LC479'><br/></div><div class='line' id='LC480'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCellOriginalBounds</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Rect</span><span class="o">(</span><span class="n">left</span><span class="o">,</span> <span class="n">top</span><span class="o">,</span> <span class="n">left</span> <span class="o">+</span> <span class="n">w</span><span class="o">,</span> <span class="n">top</span> <span class="o">+</span> <span class="n">h</span><span class="o">);</span></div><div class='line' id='LC481'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCellCurrentBounds</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Rect</span><span class="o">(</span><span class="n">mHoverCellOriginalBounds</span><span class="o">);</span></div><div class='line' id='LC482'><br/></div><div class='line' id='LC483'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">drawable</span><span class="o">.</span><span class="na">setBounds</span><span class="o">(</span><span class="n">mHoverCellCurrentBounds</span><span class="o">);</span></div><div class='line' id='LC484'><br/></div><div class='line' id='LC485'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">drawable</span><span class="o">;</span></div><div class='line' id='LC486'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC487'><br/></div><div class='line' id='LC488'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/** Draws a black border over the screenshot of the view passed in. */</span></div><div class='line' id='LC489'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">Bitmap</span> <span class="nf">getBitmapWithBorder</span><span class="o">(</span><span class="n">View</span> <span class="n">v</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC490'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bitmap</span> <span class="n">bitmap</span> <span class="o">=</span> <span class="n">getBitmapFromView</span><span class="o">(</span><span class="n">v</span><span class="o">);</span></div><div class='line' id='LC491'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Canvas</span> <span class="n">can</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Canvas</span><span class="o">(</span><span class="n">bitmap</span><span class="o">);</span></div><div class='line' id='LC492'><br/></div><div class='line' id='LC493'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Rect</span> <span class="n">rect</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Rect</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="n">bitmap</span><span class="o">.</span><span class="na">getWidth</span><span class="o">(),</span> <span class="n">bitmap</span><span class="o">.</span><span class="na">getHeight</span><span class="o">());</span></div><div class='line' id='LC494'><br/></div><div class='line' id='LC495'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Paint</span> <span class="n">paint</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Paint</span><span class="o">();</span></div><div class='line' id='LC496'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">paint</span><span class="o">.</span><span class="na">setStyle</span><span class="o">(</span><span class="n">Paint</span><span class="o">.</span><span class="na">Style</span><span class="o">.</span><span class="na">STROKE</span><span class="o">);</span></div><div class='line' id='LC497'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">paint</span><span class="o">.</span><span class="na">setStrokeWidth</span><span class="o">(</span><span class="n">LINE_THICKNESS</span><span class="o">);</span></div><div class='line' id='LC498'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">paint</span><span class="o">.</span><span class="na">setColor</span><span class="o">(</span><span class="n">Color</span><span class="o">.</span><span class="na">BLACK</span><span class="o">);</span></div><div class='line' id='LC499'><br/></div><div class='line' id='LC500'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">can</span><span class="o">.</span><span class="na">drawBitmap</span><span class="o">(</span><span class="n">bitmap</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="kc">null</span><span class="o">);</span></div><div class='line' id='LC501'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">can</span><span class="o">.</span><span class="na">drawRect</span><span class="o">(</span><span class="n">rect</span><span class="o">,</span> <span class="n">paint</span><span class="o">);</span></div><div class='line' id='LC502'><br/></div><div class='line' id='LC503'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">bitmap</span><span class="o">;</span></div><div class='line' id='LC504'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC505'><br/></div><div class='line' id='LC506'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/** Returns a bitmap showing a screenshot of the view passed in. */</span></div><div class='line' id='LC507'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">Bitmap</span> <span class="nf">getBitmapFromView</span><span class="o">(</span><span class="n">View</span> <span class="n">v</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC508'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Bitmap</span> <span class="n">bitmap</span> <span class="o">=</span> <span class="n">Bitmap</span><span class="o">.</span><span class="na">createBitmap</span><span class="o">(</span><span class="n">v</span><span class="o">.</span><span class="na">getWidth</span><span class="o">(),</span> <span class="n">v</span><span class="o">.</span><span class="na">getHeight</span><span class="o">(),</span> <span class="n">Bitmap</span><span class="o">.</span><span class="na">Config</span><span class="o">.</span><span class="na">ARGB_8888</span><span class="o">);</span></div><div class='line' id='LC509'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Canvas</span> <span class="n">canvas</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Canvas</span><span class="o">(</span><span class="n">bitmap</span><span class="o">);</span></div><div class='line' id='LC510'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">v</span><span class="o">.</span><span class="na">draw</span><span class="o">(</span><span class="n">canvas</span><span class="o">);</span></div><div class='line' id='LC511'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">bitmap</span><span class="o">;</span></div><div class='line' id='LC512'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC513'><br/></div><div class='line' id='LC514'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC515'><span class="cm">     * Stores a reference to the views above and below the item currently</span></div><div class='line' id='LC516'><span class="cm">     * corresponding to the hover cell. It is important to note that if this</span></div><div class='line' id='LC517'><span class="cm">     * item is either at the top or bottom of the list, mAboveItemId or mBelowItemId</span></div><div class='line' id='LC518'><span class="cm">     * may be invalid.</span></div><div class='line' id='LC519'><span class="cm">     */</span></div><div class='line' id='LC520'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">updateNeighborViewsForID</span><span class="o">(</span><span class="kt">long</span> <span class="n">itemID</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC521'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">position</span> <span class="o">=</span> <span class="n">getPositionForID</span><span class="o">(</span><span class="n">itemID</span><span class="o">);</span></div><div class='line' id='LC522'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">BaseAdapter</span> <span class="n">adapter</span> <span class="o">=</span> <span class="o">((</span><span class="n">BaseAdapter</span><span class="o">)</span><span class="n">getAdapter</span><span class="o">());</span></div><div class='line' id='LC523'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAboveItemId</span> <span class="o">=</span> <span class="n">adapter</span><span class="o">.</span><span class="na">getItemId</span><span class="o">(</span><span class="n">position</span> <span class="o">-</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC524'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mBelowItemId</span> <span class="o">=</span> <span class="n">adapter</span><span class="o">.</span><span class="na">getItemId</span><span class="o">(</span><span class="n">position</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC525'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC526'><br/></div><div class='line' id='LC527'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/** Retrieves the view in the list corresponding to itemID */</span></div><div class='line' id='LC528'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">View</span> <span class="nf">getViewForID</span> <span class="o">(</span><span class="kt">long</span> <span class="n">itemID</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC529'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">firstVisiblePosition</span> <span class="o">=</span> <span class="n">getFirstVisiblePosition</span><span class="o">();</span></div><div class='line' id='LC530'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">BaseAdapter</span> <span class="n">adapter</span> <span class="o">=</span> <span class="o">((</span><span class="n">BaseAdapter</span><span class="o">)</span><span class="n">getAdapter</span><span class="o">());</span></div><div class='line' id='LC531'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">getChildCount</span><span class="o">();</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></div><div class='line' id='LC532'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">v</span> <span class="o">=</span> <span class="n">getChildAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC533'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">position</span> <span class="o">=</span> <span class="n">firstVisiblePosition</span> <span class="o">+</span> <span class="n">i</span><span class="o">;</span></div><div class='line' id='LC534'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">long</span> <span class="n">id</span> <span class="o">=</span> <span class="n">adapter</span><span class="o">.</span><span class="na">getItemId</span><span class="o">(</span><span class="n">position</span><span class="o">);</span></div><div class='line' id='LC535'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">id</span> <span class="o">==</span> <span class="n">itemID</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC536'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">v</span><span class="o">;</span></div><div class='line' id='LC537'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC538'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC539'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC540'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC541'><br/></div><div class='line' id='LC542'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/** Retrieves the position in the list corresponding to itemID */</span></div><div class='line' id='LC543'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">getPositionForID</span> <span class="o">(</span><span class="kt">long</span> <span class="n">itemID</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC544'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">v</span> <span class="o">=</span> <span class="n">getViewForID</span><span class="o">(</span><span class="n">itemID</span><span class="o">);</span></div><div class='line' id='LC545'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">v</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC546'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC547'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC548'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="nf">getPositionForView</span><span class="o">(</span><span class="n">v</span><span class="o">);</span></div><div class='line' id='LC549'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC550'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC551'><br/></div><div class='line' id='LC552'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC553'><span class="cm">     *  dispatchDraw gets invoked when all the child views are about to be drawn.</span></div><div class='line' id='LC554'><span class="cm">     *  By overriding this method, the hover cell (BitmapDrawable) can be drawn</span></div><div class='line' id='LC555'><span class="cm">     *  over the listview&#39;s items whenever the listview is redrawn.</span></div><div class='line' id='LC556'><span class="cm">     */</span></div><div class='line' id='LC557'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC558'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">protected</span> <span class="kt">void</span> <span class="nf">dispatchDraw</span><span class="o">(</span><span class="n">Canvas</span> <span class="n">canvas</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC559'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">super</span><span class="o">.</span><span class="na">dispatchDraw</span><span class="o">(</span><span class="n">canvas</span><span class="o">);</span></div><div class='line' id='LC560'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mHoverCell</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC561'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCell</span><span class="o">.</span><span class="na">draw</span><span class="o">(</span><span class="n">canvas</span><span class="o">);</span></div><div class='line' id='LC562'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC563'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC564'><br/></div><div class='line' id='LC565'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC566'><span class="cm">     * This method determines whether the hover cell has been shifted far enough</span></div><div class='line' id='LC567'><span class="cm">     * to invoke a cell swap. If so, then the respective cell swap candidate is</span></div><div class='line' id='LC568'><span class="cm">     * determined and the data set is changed. Upon posting a notification of the</span></div><div class='line' id='LC569'><span class="cm">     * data set change, a layout is invoked to place the cells in the right place.</span></div><div class='line' id='LC570'><span class="cm">     * Using a ViewTreeObserver and a corresponding OnPreDrawListener, we can</span></div><div class='line' id='LC571'><span class="cm">     * offset the cell being swapped to where it previously was and then animate it to</span></div><div class='line' id='LC572'><span class="cm">     * its new position.</span></div><div class='line' id='LC573'><span class="cm">     */</span></div><div class='line' id='LC574'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">handleCellSwitch</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC575'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kt">int</span> <span class="n">deltaY</span> <span class="o">=</span> <span class="n">mLastEventY</span> <span class="o">-</span> <span class="n">mDownY</span><span class="o">;</span></div><div class='line' id='LC576'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">deltaYTotal</span> <span class="o">=</span> <span class="n">mHoverCellOriginalBounds</span><span class="o">.</span><span class="na">top</span> <span class="o">+</span> <span class="n">mTotalOffset</span> <span class="o">+</span> <span class="n">deltaY</span><span class="o">;</span></div><div class='line' id='LC577'><br/></div><div class='line' id='LC578'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">belowView</span> <span class="o">=</span> <span class="n">getViewForID</span><span class="o">(</span><span class="n">mBelowItemId</span><span class="o">);</span></div><div class='line' id='LC579'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">mobileView</span> <span class="o">=</span> <span class="n">getViewForID</span><span class="o">(</span><span class="n">mMobileItemId</span><span class="o">);</span></div><div class='line' id='LC580'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">aboveView</span> <span class="o">=</span> <span class="n">getViewForID</span><span class="o">(</span><span class="n">mAboveItemId</span><span class="o">);</span></div><div class='line' id='LC581'><br/></div><div class='line' id='LC582'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">isBelow</span> <span class="o">=</span> <span class="o">(</span><span class="n">belowView</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">deltaYTotal</span> <span class="o">&gt;</span> <span class="n">belowView</span><span class="o">.</span><span class="na">getTop</span><span class="o">());</span></div><div class='line' id='LC583'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">isAbove</span> <span class="o">=</span> <span class="o">(</span><span class="n">aboveView</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">deltaYTotal</span> <span class="o">&lt;</span> <span class="n">aboveView</span><span class="o">.</span><span class="na">getTop</span><span class="o">());</span></div><div class='line' id='LC584'><br/></div><div class='line' id='LC585'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">isBelow</span> <span class="o">||</span> <span class="n">isAbove</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC586'><br/></div><div class='line' id='LC587'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kt">long</span> <span class="n">switchItemID</span> <span class="o">=</span> <span class="n">isBelow</span> <span class="o">?</span> <span class="n">mBelowItemId</span> <span class="o">:</span> <span class="n">mAboveItemId</span><span class="o">;</span></div><div class='line' id='LC588'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">switchView</span> <span class="o">=</span> <span class="n">isBelow</span> <span class="o">?</span> <span class="n">belowView</span> <span class="o">:</span> <span class="n">aboveView</span><span class="o">;</span></div><div class='line' id='LC589'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kt">int</span> <span class="n">originalItem</span> <span class="o">=</span> <span class="n">getPositionForView</span><span class="o">(</span><span class="n">mobileView</span><span class="o">);</span></div><div class='line' id='LC590'><br/></div><div class='line' id='LC591'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">switchView</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC592'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">updateNeighborViewsForID</span><span class="o">(</span><span class="n">mMobileItemId</span><span class="o">);</span></div><div class='line' id='LC593'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC594'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC595'><br/></div><div class='line' id='LC596'><br/></div><div class='line' id='LC597'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">((</span><span class="n">RearrangementListener</span><span class="o">)</span><span class="n">getAdapter</span><span class="o">()).</span><span class="na">swapElements</span><span class="o">(</span><span class="n">originalItem</span><span class="o">,</span> <span class="n">getPositionForView</span><span class="o">(</span><span class="n">switchView</span><span class="o">));</span></div><div class='line' id='LC598'><br/></div><div class='line' id='LC599'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">((</span><span class="n">BaseAdapter</span><span class="o">)</span> <span class="n">getAdapter</span><span class="o">()).</span><span class="na">notifyDataSetChanged</span><span class="o">();</span></div><div class='line' id='LC600'><br/></div><div class='line' id='LC601'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mDownY</span> <span class="o">=</span> <span class="n">mLastEventY</span><span class="o">;</span></div><div class='line' id='LC602'><br/></div><div class='line' id='LC603'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kt">int</span> <span class="n">switchViewStartTop</span> <span class="o">=</span> <span class="n">switchView</span><span class="o">.</span><span class="na">getTop</span><span class="o">();</span></div><div class='line' id='LC604'><br/></div><div class='line' id='LC605'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mobileView</span><span class="o">.</span><span class="na">setVisibility</span><span class="o">(</span><span class="n">View</span><span class="o">.</span><span class="na">VISIBLE</span><span class="o">);</span></div><div class='line' id='LC606'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">switchView</span><span class="o">.</span><span class="na">setVisibility</span><span class="o">(</span><span class="n">View</span><span class="o">.</span><span class="na">INVISIBLE</span><span class="o">);</span></div><div class='line' id='LC607'><br/></div><div class='line' id='LC608'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">updateNeighborViewsForID</span><span class="o">(</span><span class="n">mMobileItemId</span><span class="o">);</span></div><div class='line' id='LC609'><br/></div><div class='line' id='LC610'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="n">ViewTreeObserver</span> <span class="n">observer</span> <span class="o">=</span> <span class="n">getViewTreeObserver</span><span class="o">();</span></div><div class='line' id='LC611'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">observer</span><span class="o">.</span><span class="na">addOnPreDrawListener</span><span class="o">(</span><span class="k">new</span> <span class="n">ViewTreeObserver</span><span class="o">.</span><span class="na">OnPreDrawListener</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC612'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">onPreDraw</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC613'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">observer</span><span class="o">.</span><span class="na">removeOnPreDrawListener</span><span class="o">(</span><span class="k">this</span><span class="o">);</span></div><div class='line' id='LC614'><br/></div><div class='line' id='LC615'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">switchView</span> <span class="o">=</span> <span class="n">getViewForID</span><span class="o">(</span><span class="n">switchItemID</span><span class="o">);</span></div><div class='line' id='LC616'><br/></div><div class='line' id='LC617'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mTotalOffset</span> <span class="o">+=</span> <span class="n">deltaY</span><span class="o">;</span></div><div class='line' id='LC618'><br/></div><div class='line' id='LC619'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">switchViewNewTop</span> <span class="o">=</span> <span class="n">switchView</span><span class="o">.</span><span class="na">getTop</span><span class="o">();</span></div><div class='line' id='LC620'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">delta</span> <span class="o">=</span> <span class="n">switchViewStartTop</span> <span class="o">-</span> <span class="n">switchViewNewTop</span><span class="o">;</span></div><div class='line' id='LC621'><br/></div><div class='line' id='LC622'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ViewHelper</span><span class="o">.</span><span class="na">setTranslationY</span><span class="o">(</span><span class="n">switchView</span><span class="o">,</span> <span class="n">delta</span><span class="o">);</span></div><div class='line' id='LC623'><br/></div><div class='line' id='LC624'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ObjectAnimator</span> <span class="n">animator</span> <span class="o">=</span> <span class="n">ObjectAnimator</span><span class="o">.</span><span class="na">ofPropertyValuesHolder</span><span class="o">(</span><span class="n">switchView</span><span class="o">,</span></div><div class='line' id='LC625'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">PropertyValuesHolder</span><span class="o">.</span><span class="na">ofFloat</span><span class="o">(</span><span class="s">&quot;translationY&quot;</span><span class="o">,</span> <span class="mi">0</span><span class="o">));</span></div><div class='line' id='LC626'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">animator</span><span class="o">.</span><span class="na">setDuration</span><span class="o">(</span><span class="n">MOVE_DURATION</span><span class="o">);</span></div><div class='line' id='LC627'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">animator</span><span class="o">.</span><span class="na">start</span><span class="o">();</span></div><div class='line' id='LC628'><br/></div><div class='line' id='LC629'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC630'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC631'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">});</span></div><div class='line' id='LC632'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC633'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC634'><br/></div><div class='line' id='LC635'><br/></div><div class='line' id='LC636'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC637'><span class="cm">     * Resets all the appropriate fields to a default state while also animating</span></div><div class='line' id='LC638'><span class="cm">     * the hover cell back to its correct location.</span></div><div class='line' id='LC639'><span class="cm">     */</span></div><div class='line' id='LC640'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">touchEventsEnded</span> <span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC641'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="n">View</span> <span class="n">mobileView</span> <span class="o">=</span> <span class="n">getViewForID</span><span class="o">(</span><span class="n">mMobileItemId</span><span class="o">);</span></div><div class='line' id='LC642'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mCellIsMobile</span><span class="o">||</span> <span class="n">mIsWaitingForScrollFinish</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC643'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mCellIsMobile</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC644'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mIsWaitingForScrollFinish</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC645'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mIsMobileScrolling</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC646'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mActivePointerId</span> <span class="o">=</span> <span class="n">INVALID_POINTER_ID</span><span class="o">;</span></div><div class='line' id='LC647'><br/></div><div class='line' id='LC648'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// If the autoscroller has not completed scrolling, we need to wait for it to</span></div><div class='line' id='LC649'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// finish in order to determine the final location of where the hover cell</span></div><div class='line' id='LC650'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// should be animated to.</span></div><div class='line' id='LC651'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mScrollState</span> <span class="o">!=</span> <span class="n">OnScrollListener</span><span class="o">.</span><span class="na">SCROLL_STATE_IDLE</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC652'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mIsWaitingForScrollFinish</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC653'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC654'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC655'><br/></div><div class='line' id='LC656'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCellCurrentBounds</span><span class="o">.</span><span class="na">offsetTo</span><span class="o">(</span><span class="n">mHoverCellOriginalBounds</span><span class="o">.</span><span class="na">left</span><span class="o">,</span> <span class="n">mobileView</span><span class="o">.</span><span class="na">getTop</span><span class="o">());</span></div><div class='line' id='LC657'><br/></div><div class='line' id='LC658'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ObjectAnimator</span> <span class="n">hoverViewAnimator</span> <span class="o">=</span> <span class="n">ObjectAnimator</span><span class="o">.</span><span class="na">ofObject</span><span class="o">(</span><span class="n">mHoverCell</span><span class="o">,</span> <span class="s">&quot;bounds&quot;</span><span class="o">,</span></div><div class='line' id='LC659'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">sBoundEvaluator</span><span class="o">,</span> <span class="n">mHoverCellCurrentBounds</span><span class="o">);</span></div><div class='line' id='LC660'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">hoverViewAnimator</span><span class="o">.</span><span class="na">addUpdateListener</span><span class="o">(</span><span class="k">new</span> <span class="n">ValueAnimator</span><span class="o">.</span><span class="na">AnimatorUpdateListener</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC661'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC662'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onAnimationUpdate</span><span class="o">(</span><span class="n">ValueAnimator</span> <span class="n">valueAnimator</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC663'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">invalidate</span><span class="o">();</span></div><div class='line' id='LC664'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC665'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">});</span></div><div class='line' id='LC666'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">hoverViewAnimator</span><span class="o">.</span><span class="na">addListener</span><span class="o">(</span><span class="k">new</span> <span class="n">AnimatorListenerAdapter</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC667'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC668'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onAnimationStart</span><span class="o">(</span><span class="n">Animator</span> <span class="n">animation</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC669'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setEnabled</span><span class="o">(</span><span class="kc">false</span><span class="o">);</span></div><div class='line' id='LC670'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC671'><br/></div><div class='line' id='LC672'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC673'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onAnimationEnd</span><span class="o">(</span><span class="n">Animator</span> <span class="n">animation</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC674'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAboveItemId</span> <span class="o">=</span> <span class="n">INVALID_ID</span><span class="o">;</span></div><div class='line' id='LC675'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mMobileItemId</span> <span class="o">=</span> <span class="n">INVALID_ID</span><span class="o">;</span></div><div class='line' id='LC676'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mBelowItemId</span> <span class="o">=</span> <span class="n">INVALID_ID</span><span class="o">;</span></div><div class='line' id='LC677'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mobileView</span><span class="o">.</span><span class="na">setVisibility</span><span class="o">(</span><span class="n">VISIBLE</span><span class="o">);</span></div><div class='line' id='LC678'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCell</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC679'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">setEnabled</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></div><div class='line' id='LC680'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">invalidate</span><span class="o">();</span></div><div class='line' id='LC681'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC682'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">});</span></div><div class='line' id='LC683'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">hoverViewAnimator</span><span class="o">.</span><span class="na">start</span><span class="o">();</span></div><div class='line' id='LC684'><br/></div><div class='line' id='LC685'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">((</span><span class="n">RearrangementListener</span><span class="o">)</span><span class="n">getAdapter</span><span class="o">()).</span><span class="na">onFinishedRearranging</span><span class="o">();</span></div><div class='line' id='LC686'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC687'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">touchEventsCancelled</span><span class="o">();</span></div><div class='line' id='LC688'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC689'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC690'><br/></div><div class='line' id='LC691'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC692'><span class="cm">     * Resets all the appropriate fields to a default state.</span></div><div class='line' id='LC693'><span class="cm">     */</span></div><div class='line' id='LC694'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">touchEventsCancelled</span> <span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC695'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">mobileView</span> <span class="o">=</span> <span class="n">getViewForID</span><span class="o">(</span><span class="n">mMobileItemId</span><span class="o">);</span></div><div class='line' id='LC696'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mCellIsMobile</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC697'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAboveItemId</span> <span class="o">=</span> <span class="n">INVALID_ID</span><span class="o">;</span></div><div class='line' id='LC698'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mMobileItemId</span> <span class="o">=</span> <span class="n">INVALID_ID</span><span class="o">;</span></div><div class='line' id='LC699'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mBelowItemId</span> <span class="o">=</span> <span class="n">INVALID_ID</span><span class="o">;</span></div><div class='line' id='LC700'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mobileView</span><span class="o">.</span><span class="na">setVisibility</span><span class="o">(</span><span class="n">VISIBLE</span><span class="o">);</span></div><div class='line' id='LC701'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCell</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC702'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">invalidate</span><span class="o">();</span></div><div class='line' id='LC703'><br/></div><div class='line' id='LC704'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">((</span><span class="n">RearrangementListener</span><span class="o">)</span><span class="n">getAdapter</span><span class="o">()).</span><span class="na">onFinishedRearranging</span><span class="o">();</span></div><div class='line' id='LC705'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC706'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mCellIsMobile</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC707'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mIsMobileScrolling</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC708'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mActivePointerId</span> <span class="o">=</span> <span class="n">INVALID_POINTER_ID</span><span class="o">;</span></div><div class='line' id='LC709'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC710'><br/></div><div class='line' id='LC711'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC712'><span class="cm">     * This TypeEvaluator is used to animate the BitmapDrawable back to its</span></div><div class='line' id='LC713'><span class="cm">     * final location when the user lifts his finger by modifying the</span></div><div class='line' id='LC714'><span class="cm">     * BitmapDrawable&#39;s bounds.</span></div><div class='line' id='LC715'><span class="cm">     */</span></div><div class='line' id='LC716'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">final</span> <span class="kd">static</span> <span class="n">TypeEvaluator</span><span class="o">&lt;</span><span class="n">Rect</span><span class="o">&gt;</span> <span class="n">sBoundEvaluator</span> <span class="o">=</span> <span class="k">new</span> <span class="n">TypeEvaluator</span><span class="o">&lt;</span><span class="n">Rect</span><span class="o">&gt;()</span> <span class="o">{</span></div><div class='line' id='LC717'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">Rect</span> <span class="nf">evaluate</span><span class="o">(</span><span class="kt">float</span> <span class="n">fraction</span><span class="o">,</span> <span class="n">Rect</span> <span class="n">startValue</span><span class="o">,</span> <span class="n">Rect</span> <span class="n">endValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC718'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">new</span> <span class="nf">Rect</span><span class="o">(</span><span class="n">interpolate</span><span class="o">(</span><span class="n">startValue</span><span class="o">.</span><span class="na">left</span><span class="o">,</span> <span class="n">endValue</span><span class="o">.</span><span class="na">left</span><span class="o">,</span> <span class="n">fraction</span><span class="o">),</span></div><div class='line' id='LC719'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">interpolate</span><span class="o">(</span><span class="n">startValue</span><span class="o">.</span><span class="na">top</span><span class="o">,</span> <span class="n">endValue</span><span class="o">.</span><span class="na">top</span><span class="o">,</span> <span class="n">fraction</span><span class="o">),</span></div><div class='line' id='LC720'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">interpolate</span><span class="o">(</span><span class="n">startValue</span><span class="o">.</span><span class="na">right</span><span class="o">,</span> <span class="n">endValue</span><span class="o">.</span><span class="na">right</span><span class="o">,</span> <span class="n">fraction</span><span class="o">),</span></div><div class='line' id='LC721'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">interpolate</span><span class="o">(</span><span class="n">startValue</span><span class="o">.</span><span class="na">bottom</span><span class="o">,</span> <span class="n">endValue</span><span class="o">.</span><span class="na">bottom</span><span class="o">,</span> <span class="n">fraction</span><span class="o">));</span></div><div class='line' id='LC722'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC723'><br/></div><div class='line' id='LC724'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">int</span> <span class="nf">interpolate</span><span class="o">(</span><span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="kt">int</span> <span class="n">end</span><span class="o">,</span> <span class="kt">float</span> <span class="n">fraction</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC725'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="o">(</span><span class="kt">int</span><span class="o">)(</span><span class="n">start</span> <span class="o">+</span> <span class="n">fraction</span> <span class="o">*</span> <span class="o">(</span><span class="n">end</span> <span class="o">-</span> <span class="n">start</span><span class="o">));</span></div><div class='line' id='LC726'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC727'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">};</span></div><div class='line' id='LC728'><br/></div><div class='line' id='LC729'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC730'><span class="cm">     *  Determines whether this listview is in a scrolling state invoked</span></div><div class='line' id='LC731'><span class="cm">     *  by the fact that the hover cell is out of the bounds of the listview;</span></div><div class='line' id='LC732'><span class="cm">     */</span></div><div class='line' id='LC733'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">handleMobileCellScroll</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC734'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mIsMobileScrolling</span> <span class="o">=</span> <span class="n">handleMobileCellScroll</span><span class="o">(</span><span class="n">mHoverCellCurrentBounds</span><span class="o">);</span></div><div class='line' id='LC735'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC736'><br/></div><div class='line' id='LC737'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC738'><span class="cm">     * This method is in charge of determining if the hover cell is above</span></div><div class='line' id='LC739'><span class="cm">     * or below the bounds of the listview. If so, the listview does an appropriate</span></div><div class='line' id='LC740'><span class="cm">     * upward or downward smooth scroll so as to reveal new items.</span></div><div class='line' id='LC741'><span class="cm">     */</span></div><div class='line' id='LC742'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">handleMobileCellScroll</span><span class="o">(</span><span class="n">Rect</span> <span class="n">r</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC743'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">offset</span> <span class="o">=</span> <span class="n">computeVerticalScrollOffset</span><span class="o">();</span></div><div class='line' id='LC744'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">height</span> <span class="o">=</span> <span class="n">getHeight</span><span class="o">();</span></div><div class='line' id='LC745'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">extent</span> <span class="o">=</span> <span class="n">computeVerticalScrollExtent</span><span class="o">();</span></div><div class='line' id='LC746'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">range</span> <span class="o">=</span> <span class="n">computeVerticalScrollRange</span><span class="o">();</span></div><div class='line' id='LC747'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">hoverViewTop</span> <span class="o">=</span> <span class="n">r</span><span class="o">.</span><span class="na">top</span><span class="o">;</span></div><div class='line' id='LC748'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">hoverHeight</span> <span class="o">=</span> <span class="n">r</span><span class="o">.</span><span class="na">height</span><span class="o">();</span></div><div class='line' id='LC749'><br/></div><div class='line' id='LC750'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">hoverViewTop</span> <span class="o">&lt;=</span> <span class="mi">0</span> <span class="o">&amp;&amp;</span> <span class="n">offset</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC751'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">smoothScrollBy</span><span class="o">(-</span><span class="n">mSmoothScrollAmountAtEdge</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC752'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC753'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC754'><br/></div><div class='line' id='LC755'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">hoverViewTop</span> <span class="o">+</span> <span class="n">hoverHeight</span> <span class="o">&gt;=</span> <span class="n">height</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">offset</span> <span class="o">+</span> <span class="n">extent</span><span class="o">)</span> <span class="o">&lt;</span> <span class="n">range</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC756'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">smoothScrollBy</span><span class="o">(</span><span class="n">mSmoothScrollAmountAtEdge</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC757'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC758'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC759'><br/></div><div class='line' id='LC760'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC761'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC762'><br/></div><div class='line' id='LC763'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC764'><span class="cm">     * This scroll listener is added to the listview in order to handle cell swapping</span></div><div class='line' id='LC765'><span class="cm">     * when the cell is either at the top or bottom edge of the listview. If the hover</span></div><div class='line' id='LC766'><span class="cm">     * cell is at either edge of the listview, the listview will begin scrolling. As</span></div><div class='line' id='LC767'><span class="cm">     * scrolling takes place, the listview continuously checks if new cells became visible</span></div><div class='line' id='LC768'><span class="cm">     * and determines whether they are potential candidates for a cell swap.</span></div><div class='line' id='LC769'><span class="cm">     */</span></div><div class='line' id='LC770'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="n">AbsListView</span><span class="o">.</span><span class="na">OnScrollListener</span> <span class="n">mScrollListener</span> <span class="o">=</span> <span class="k">new</span> <span class="n">AbsListView</span><span class="o">.</span><span class="na">OnScrollListener</span> <span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC771'><br/></div><div class='line' id='LC772'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mPreviousFirstVisibleItem</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC773'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mPreviousVisibleItemCount</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC774'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mCurrentFirstVisibleItem</span><span class="o">;</span></div><div class='line' id='LC775'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mCurrentVisibleItemCount</span><span class="o">;</span></div><div class='line' id='LC776'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">int</span> <span class="n">mCurrentScrollState</span><span class="o">;</span></div><div class='line' id='LC777'><br/></div><div class='line' id='LC778'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onScroll</span><span class="o">(</span><span class="n">AbsListView</span> <span class="n">view</span><span class="o">,</span> <span class="kt">int</span> <span class="n">firstVisibleItem</span><span class="o">,</span> <span class="kt">int</span> <span class="n">visibleItemCount</span><span class="o">,</span></div><div class='line' id='LC779'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">totalItemCount</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC780'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mCurrentFirstVisibleItem</span> <span class="o">=</span> <span class="n">firstVisibleItem</span><span class="o">;</span></div><div class='line' id='LC781'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mCurrentVisibleItemCount</span> <span class="o">=</span> <span class="n">visibleItemCount</span><span class="o">;</span></div><div class='line' id='LC782'><br/></div><div class='line' id='LC783'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mPreviousFirstVisibleItem</span> <span class="o">=</span> <span class="o">(</span><span class="n">mPreviousFirstVisibleItem</span> <span class="o">==</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span> <span class="o">?</span> <span class="n">mCurrentFirstVisibleItem</span></div><div class='line' id='LC784'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">mPreviousFirstVisibleItem</span><span class="o">;</span></div><div class='line' id='LC785'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mPreviousVisibleItemCount</span> <span class="o">=</span> <span class="o">(</span><span class="n">mPreviousVisibleItemCount</span> <span class="o">==</span> <span class="o">-</span><span class="mi">1</span><span class="o">)</span> <span class="o">?</span> <span class="n">mCurrentVisibleItemCount</span></div><div class='line' id='LC786'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">:</span> <span class="n">mPreviousVisibleItemCount</span><span class="o">;</span></div><div class='line' id='LC787'><br/></div><div class='line' id='LC788'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkAndHandleFirstVisibleCellChange</span><span class="o">();</span></div><div class='line' id='LC789'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">checkAndHandleLastVisibleCellChange</span><span class="o">();</span></div><div class='line' id='LC790'><br/></div><div class='line' id='LC791'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mPreviousFirstVisibleItem</span> <span class="o">=</span> <span class="n">mCurrentFirstVisibleItem</span><span class="o">;</span></div><div class='line' id='LC792'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mPreviousVisibleItemCount</span> <span class="o">=</span> <span class="n">mCurrentVisibleItemCount</span><span class="o">;</span></div><div class='line' id='LC793'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC794'><br/></div><div class='line' id='LC795'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC796'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onScrollStateChanged</span><span class="o">(</span><span class="n">AbsListView</span> <span class="n">view</span><span class="o">,</span> <span class="kt">int</span> <span class="n">scrollState</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC797'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipePaused</span> <span class="o">=</span> <span class="n">scrollState</span> <span class="o">==</span> <span class="n">OnScrollListener</span><span class="o">.</span><span class="na">SCROLL_STATE_TOUCH_SCROLL</span><span class="o">;</span></div><div class='line' id='LC798'><br/></div><div class='line' id='LC799'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mCurrentScrollState</span> <span class="o">=</span> <span class="n">scrollState</span><span class="o">;</span></div><div class='line' id='LC800'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mScrollState</span> <span class="o">=</span> <span class="n">scrollState</span><span class="o">;</span></div><div class='line' id='LC801'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">isScrollCompleted</span><span class="o">();</span></div><div class='line' id='LC802'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC803'><br/></div><div class='line' id='LC804'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC805'><span class="cm">         * This method is in charge of invoking 1 of 2 actions. Firstly, if the listview</span></div><div class='line' id='LC806'><span class="cm">         * is in a state of scrolling invoked by the hover cell being outside the bounds</span></div><div class='line' id='LC807'><span class="cm">         * of the listview, then this scrolling event is continued. Secondly, if the hover</span></div><div class='line' id='LC808'><span class="cm">         * cell has already been released, this invokes the animation for the hover cell</span></div><div class='line' id='LC809'><span class="cm">         * to return to its correct position after the listview has entered an idle scroll</span></div><div class='line' id='LC810'><span class="cm">         * state.</span></div><div class='line' id='LC811'><span class="cm">         */</span></div><div class='line' id='LC812'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">isScrollCompleted</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC813'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mCurrentVisibleItemCount</span> <span class="o">&gt;</span> <span class="mi">0</span> <span class="o">&amp;&amp;</span> <span class="n">mCurrentScrollState</span> <span class="o">==</span> <span class="n">SCROLL_STATE_IDLE</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC814'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mCellIsMobile</span> <span class="o">&amp;&amp;</span> <span class="n">mIsMobileScrolling</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC815'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">handleMobileCellScroll</span><span class="o">();</span></div><div class='line' id='LC816'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">mIsWaitingForScrollFinish</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC817'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">touchEventsEnded</span><span class="o">();</span></div><div class='line' id='LC818'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC819'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC820'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC821'><br/></div><div class='line' id='LC822'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC823'><span class="cm">         * Determines if the listview scrolled up enough to reveal a new cell at the</span></div><div class='line' id='LC824'><span class="cm">         * top of the list. If so, then the appropriate parameters are updated.</span></div><div class='line' id='LC825'><span class="cm">         */</span></div><div class='line' id='LC826'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">checkAndHandleFirstVisibleCellChange</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC827'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mCurrentFirstVisibleItem</span> <span class="o">!=</span> <span class="n">mPreviousFirstVisibleItem</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC828'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mCellIsMobile</span> <span class="o">&amp;&amp;</span> <span class="n">mMobileItemId</span> <span class="o">!=</span> <span class="n">INVALID_ID</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC829'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">updateNeighborViewsForID</span><span class="o">(</span><span class="n">mMobileItemId</span><span class="o">);</span></div><div class='line' id='LC830'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">handleCellSwitch</span><span class="o">();</span></div><div class='line' id='LC831'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC832'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC833'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC834'><br/></div><div class='line' id='LC835'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC836'><span class="cm">         * Determines if the listview scrolled down enough to reveal a new cell at the</span></div><div class='line' id='LC837'><span class="cm">         * bottom of the list. If so, then the appropriate parameters are updated.</span></div><div class='line' id='LC838'><span class="cm">         */</span></div><div class='line' id='LC839'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">checkAndHandleLastVisibleCellChange</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC840'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">currentLastVisibleItem</span> <span class="o">=</span> <span class="n">mCurrentFirstVisibleItem</span> <span class="o">+</span> <span class="n">mCurrentVisibleItemCount</span><span class="o">;</span></div><div class='line' id='LC841'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">previousLastVisibleItem</span> <span class="o">=</span> <span class="n">mPreviousFirstVisibleItem</span> <span class="o">+</span> <span class="n">mPreviousVisibleItemCount</span><span class="o">;</span></div><div class='line' id='LC842'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">currentLastVisibleItem</span> <span class="o">!=</span> <span class="n">previousLastVisibleItem</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC843'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mCellIsMobile</span> <span class="o">&amp;&amp;</span> <span class="n">mMobileItemId</span> <span class="o">!=</span> <span class="n">INVALID_ID</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC844'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">updateNeighborViewsForID</span><span class="o">(</span><span class="n">mMobileItemId</span><span class="o">);</span></div><div class='line' id='LC845'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">handleCellSwitch</span><span class="o">();</span></div><div class='line' id='LC846'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC847'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC848'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC849'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">};</span></div><div class='line' id='LC850'><br/></div><div class='line' id='LC851'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">EnhancedListView</span> <span class="nf">enableRearranging</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC852'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mRearrangingEnabled</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC853'><br/></div><div class='line' id='LC854'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC855'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC856'><br/></div><div class='line' id='LC857'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC858'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">setAdapter</span><span class="o">(</span><span class="n">ListAdapter</span> <span class="n">adapter</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC859'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!(</span><span class="n">adapter</span> <span class="k">instanceof</span> <span class="n">RearrangementListener</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="n">mRearrangingEnabled</span><span class="o">){</span></div><div class='line' id='LC860'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalStateException</span><span class="o">(</span><span class="s">&quot;Adapter must implement RearrangementListener if rearranging is enabled.&quot;</span><span class="o">);</span></div><div class='line' id='LC861'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC862'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">super</span><span class="o">.</span><span class="na">setAdapter</span><span class="o">(</span><span class="n">adapter</span><span class="o">);</span></div><div class='line' id='LC863'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC864'><br/></div><div class='line' id='LC865'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC866'><span class="cm">     * Enables the &lt;i&gt;Swipe to Dismiss&lt;/i&gt; feature for this list. This allows users to swipe out</span></div><div class='line' id='LC867'><span class="cm">     * an list item element to delete it from the list. Every time the user swipes out an element</span></div><div class='line' id='LC868'><span class="cm">     * {@link de.timroes.android.listview.EnhancedListView.OnDismissCallback#onDismiss(EnhancedListView, int)}</span></div><div class='line' id='LC869'><span class="cm">     * of the given {@link de.timroes.android.listview.EnhancedListView} will be called. To enable</span></div><div class='line' id='LC870'><span class="cm">     * &lt;i&gt;undo&lt;/i&gt; of the deletion, return an {@link de.timroes.android.listview.EnhancedListView.Undoable}</span></div><div class='line' id='LC871'><span class="cm">     * from {@link de.timroes.android.listview.EnhancedListView.OnDismissCallback#onDismiss(EnhancedListView, int)}.</span></div><div class='line' id='LC872'><span class="cm">     * Return {@code null}, if you don&#39;t want the &lt;i&gt;undo&lt;/i&gt; feature enabled. Read the README file</span></div><div class='line' id='LC873'><span class="cm">     * or the demo project for more detailed samples.</span></div><div class='line' id='LC874'><span class="cm">     *</span></div><div class='line' id='LC875'><span class="cm">     * @return The {@link de.timroes.android.listview.EnhancedListView}</span></div><div class='line' id='LC876'><span class="cm">     * @throws java.lang.IllegalStateException when you haven&#39;t passed an {@link EnhancedListView.OnDismissCallback}</span></div><div class='line' id='LC877'><span class="cm">     *      to {@link #setDismissCallback(EnhancedListView.OnDismissCallback)} before calling this</span></div><div class='line' id='LC878'><span class="cm">     *      method.</span></div><div class='line' id='LC879'><span class="cm">     */</span></div><div class='line' id='LC880'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">EnhancedListView</span> <span class="nf">enableSwipeToDismiss</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC881'><br/></div><div class='line' id='LC882'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mDismissCallback</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC883'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalStateException</span><span class="o">(</span><span class="s">&quot;You must pass an OnDismissCallback to the list before enabling Swipe to Dismiss.&quot;</span><span class="o">);</span></div><div class='line' id='LC884'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC885'><br/></div><div class='line' id='LC886'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipeEnabled</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC887'><br/></div><div class='line' id='LC888'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC889'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC890'><br/></div><div class='line' id='LC891'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC892'><span class="cm">     * Disables the &lt;i&gt;Swipe to Dismiss&lt;/i&gt; feature for this list.</span></div><div class='line' id='LC893'><span class="cm">     *</span></div><div class='line' id='LC894'><span class="cm">     * @return This {@link de.timroes.android.listview.EnhancedListView}</span></div><div class='line' id='LC895'><span class="cm">     */</span></div><div class='line' id='LC896'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">EnhancedListView</span> <span class="nf">disableSwipeToDismiss</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC897'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipeEnabled</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC898'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC899'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC900'><br/></div><div class='line' id='LC901'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC902'><span class="cm">     * Sets the callback to be called when the user dismissed an item from the list (either by</span></div><div class='line' id='LC903'><span class="cm">     * swiping it out - with &lt;i&gt;Swipe to Dismiss&lt;/i&gt; enabled - or by deleting it with</span></div><div class='line' id='LC904'><span class="cm">     * {@link #delete(int)}). You must call this, before you call {@link #delete(int)} or</span></div><div class='line' id='LC905'><span class="cm">     * {@link #enableSwipeToDismiss()} otherwise you will get an {@link java.lang.IllegalStateException}.</span></div><div class='line' id='LC906'><span class="cm">     *</span></div><div class='line' id='LC907'><span class="cm">     * @param dismissCallback The callback used to handle dismisses of list items.</span></div><div class='line' id='LC908'><span class="cm">     * @return This {@link de.timroes.android.listview.EnhancedListView}</span></div><div class='line' id='LC909'><span class="cm">     */</span></div><div class='line' id='LC910'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">EnhancedListView</span> <span class="nf">setDismissCallback</span><span class="o">(</span><span class="n">OnDismissCallback</span> <span class="n">dismissCallback</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC911'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mDismissCallback</span> <span class="o">=</span> <span class="n">dismissCallback</span><span class="o">;</span></div><div class='line' id='LC912'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC913'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC914'><br/></div><div class='line' id='LC915'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC916'><span class="cm">     * Sets the undo style of this list. See the javadoc of {@link de.timroes.android.listview.EnhancedListView.UndoStyle}</span></div><div class='line' id='LC917'><span class="cm">     * for a detailed explanation of the different styles. The default style (if you never call this</span></div><div class='line' id='LC918'><span class="cm">     * method) is {@link de.timroes.android.listview.EnhancedListView.UndoStyle#SINGLE_POPUP}.</span></div><div class='line' id='LC919'><span class="cm">     *</span></div><div class='line' id='LC920'><span class="cm">     * @param undoStyle The style of this listview.</span></div><div class='line' id='LC921'><span class="cm">     * @return This {@link de.timroes.android.listview.EnhancedListView}</span></div><div class='line' id='LC922'><span class="cm">     */</span></div><div class='line' id='LC923'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">EnhancedListView</span> <span class="nf">setUndoStyle</span><span class="o">(</span><span class="n">UndoStyle</span> <span class="n">undoStyle</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC924'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoStyle</span> <span class="o">=</span> <span class="n">undoStyle</span><span class="o">;</span></div><div class='line' id='LC925'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC926'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC927'><br/></div><div class='line' id='LC928'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC929'><span class="cm">     * Sets the time in milliseconds after which the undo popup automatically disappears.</span></div><div class='line' id='LC930'><span class="cm">     * The countdown will start when the user touches the screen. If you want to start the countdown</span></div><div class='line' id='LC931'><span class="cm">     * immediately when the popups appears, call {@link #setRequireTouchBeforeDismiss(boolean)} with</span></div><div class='line' id='LC932'><span class="cm">     * {@code false}.</span></div><div class='line' id='LC933'><span class="cm">     *</span></div><div class='line' id='LC934'><span class="cm">     * @param hideDelay The delay in milliseconds.</span></div><div class='line' id='LC935'><span class="cm">     * @return This {@link de.timroes.android.listview.EnhancedListView}</span></div><div class='line' id='LC936'><span class="cm">     */</span></div><div class='line' id='LC937'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">EnhancedListView</span> <span class="nf">setUndoHideDelay</span><span class="o">(</span><span class="kt">int</span> <span class="n">hideDelay</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC938'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoHideDelay</span> <span class="o">=</span> <span class="n">hideDelay</span><span class="o">;</span></div><div class='line' id='LC939'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC940'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC941'><br/></div><div class='line' id='LC942'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC943'><span class="cm">     * Sets whether another touch on the view is required before the popup counts down to dismiss</span></div><div class='line' id='LC944'><span class="cm">     * the undo popup. By default this is set to {@code true}.</span></div><div class='line' id='LC945'><span class="cm">     *</span></div><div class='line' id='LC946'><span class="cm">     * @param touchBeforeDismiss Whether the screen needs to be touched before the countdown starts.</span></div><div class='line' id='LC947'><span class="cm">     * @return This {@link de.timroes.android.listview.EnhancedListView}</span></div><div class='line' id='LC948'><span class="cm">     *</span></div><div class='line' id='LC949'><span class="cm">     * @see #setUndoHideDelay(int)</span></div><div class='line' id='LC950'><span class="cm">     */</span></div><div class='line' id='LC951'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">EnhancedListView</span> <span class="nf">setRequireTouchBeforeDismiss</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">touchBeforeDismiss</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC952'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mTouchBeforeAutoHide</span> <span class="o">=</span> <span class="n">touchBeforeDismiss</span><span class="o">;</span></div><div class='line' id='LC953'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC954'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC955'><br/></div><div class='line' id='LC956'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC957'><span class="cm">     * Sets the directions in which a list item can be swiped to delete.</span></div><div class='line' id='LC958'><span class="cm">     * By default this is set to {@link SwipeDirection#BOTH} so that an item</span></div><div class='line' id='LC959'><span class="cm">     * can be swiped into both directions.</span></div><div class='line' id='LC960'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC961'><span class="cm">     * &lt;b&gt;Note:&lt;/b&gt; This method requires the &lt;i&gt;Swipe to Dismiss&lt;/i&gt; feature enabled. Use</span></div><div class='line' id='LC962'><span class="cm">     * {@link #enableSwipeToDismiss()} to enable the feature.</span></div><div class='line' id='LC963'><span class="cm">     *</span></div><div class='line' id='LC964'><span class="cm">     * @param direction The direction to which the swipe should be limited.</span></div><div class='line' id='LC965'><span class="cm">     * @return This {@link de.timroes.android.listview.EnhancedListView}</span></div><div class='line' id='LC966'><span class="cm">     */</span></div><div class='line' id='LC967'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">EnhancedListView</span> <span class="nf">setSwipeDirection</span><span class="o">(</span><span class="n">SwipeDirection</span> <span class="n">direction</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC968'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipeDirection</span> <span class="o">=</span> <span class="n">direction</span><span class="o">;</span></div><div class='line' id='LC969'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC970'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC971'><br/></div><div class='line' id='LC972'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC973'><span class="cm">     * Sets the id of the view, that should be moved, when the user swipes an item.</span></div><div class='line' id='LC974'><span class="cm">     * Only the view with the specified id will move, while all other views in the list item, will</span></div><div class='line' id='LC975'><span class="cm">     * stay where they are. This might be usefull to have a background behind the view that is swiped</span></div><div class='line' id='LC976'><span class="cm">     * out, to stay where it is (and maybe explain that the item is going to be deleted).</span></div><div class='line' id='LC977'><span class="cm">     * If you never call this method (or call it with 0), the whole view will be swiped. Also if there</span></div><div class='line' id='LC978'><span class="cm">     * is no view in a list item, with the given id, the whole view will be swiped.</span></div><div class='line' id='LC979'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC980'><span class="cm">     * &lt;b&gt;Note:&lt;/b&gt; This method requires the &lt;i&gt;Swipe to Dismiss&lt;/i&gt; feature enabled. Use</span></div><div class='line' id='LC981'><span class="cm">     * {@link #enableSwipeToDismiss()} to enable the feature.</span></div><div class='line' id='LC982'><span class="cm">     *</span></div><div class='line' id='LC983'><span class="cm">     * @param swipingLayoutId The id (from R.id) of the view, that should be swiped.</span></div><div class='line' id='LC984'><span class="cm">     * @return This {@link de.timroes.android.listview.EnhancedListView}</span></div><div class='line' id='LC985'><span class="cm">     */</span></div><div class='line' id='LC986'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="n">EnhancedListView</span> <span class="nf">setSwipingLayout</span><span class="o">(</span><span class="kt">int</span> <span class="n">swipingLayoutId</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC987'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipingLayout</span> <span class="o">=</span> <span class="n">swipingLayoutId</span><span class="o">;</span></div><div class='line' id='LC988'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="k">this</span><span class="o">;</span></div><div class='line' id='LC989'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC990'><br/></div><div class='line' id='LC991'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC992'><span class="cm">     * Discard all stored undos and hide the undo popup dialog.</span></div><div class='line' id='LC993'><span class="cm">     * This method must be called in {@link android.app.Activity#onStop()}. Otherwise</span></div><div class='line' id='LC994'><span class="cm">     * {@link EnhancedListView.Undoable#discard()} might not be called for several items, what might</span></div><div class='line' id='LC995'><span class="cm">     * break your data consistency.</span></div><div class='line' id='LC996'><span class="cm">     */</span></div><div class='line' id='LC997'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">discardUndo</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC998'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span><span class="o">(</span><span class="n">Undoable</span> <span class="n">undoable</span> <span class="o">:</span> <span class="n">mUndoActions</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC999'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">undoable</span><span class="o">.</span><span class="na">discard</span><span class="o">();</span></div><div class='line' id='LC1000'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1001'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoActions</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></div><div class='line' id='LC1002'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopup</span><span class="o">.</span><span class="na">dismiss</span><span class="o">();</span></div><div class='line' id='LC1003'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1004'><br/></div><div class='line' id='LC1005'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1006'><span class="cm">     * Delete the list item at the specified position. This will animate the item sliding out of the</span></div><div class='line' id='LC1007'><span class="cm">     * list and then collapsing until it vanished (same as if the user slides out an item).</span></div><div class='line' id='LC1008'><span class="cm">     * &lt;p&gt;</span></div><div class='line' id='LC1009'><span class="cm">     * NOTE: If you are using list headers, be aware, that the position argument must take care of</span></div><div class='line' id='LC1010'><span class="cm">     * them. Meaning 0 references the first list header. So if you want to delete the first list</span></div><div class='line' id='LC1011'><span class="cm">     * item, you have to pass the number of list headers as {@code position}. Most of the times</span></div><div class='line' id='LC1012'><span class="cm">     * that shouldn&#39;t be a problem, since you most probably will evaluate the position which should</span></div><div class='line' id='LC1013'><span class="cm">     * be deleted in a way, that respects the list headers.</span></div><div class='line' id='LC1014'><span class="cm">     *</span></div><div class='line' id='LC1015'><span class="cm">     * @param position The position of the item in the list.</span></div><div class='line' id='LC1016'><span class="cm">     * @throws java.lang.IndexOutOfBoundsException when trying to delete an item outside of the list range.</span></div><div class='line' id='LC1017'><span class="cm">     * @throws java.lang.IllegalStateException when this method is called before an {@link EnhancedListView.OnDismissCallback}</span></div><div class='line' id='LC1018'><span class="cm">     *      is set via {@link #setDismissCallback(de.timroes.android.listview.EnhancedListView.OnDismissCallback)}.</span></div><div class='line' id='LC1019'><span class="cm">     * */</span></div><div class='line' id='LC1020'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">delete</span><span class="o">(</span><span class="kt">int</span> <span class="n">position</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1021'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mDismissCallback</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1022'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalStateException</span><span class="o">(</span><span class="s">&quot;You must set an OnDismissCallback, before deleting items.&quot;</span><span class="o">);</span></div><div class='line' id='LC1023'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1024'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">position</span> <span class="o">&lt;</span> <span class="mi">0</span> <span class="o">||</span> <span class="n">position</span> <span class="o">&gt;=</span> <span class="n">getCount</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1025'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">throw</span> <span class="k">new</span> <span class="nf">IndexOutOfBoundsException</span><span class="o">(</span><span class="n">String</span><span class="o">.</span><span class="na">format</span><span class="o">(</span><span class="s">&quot;Tried to delete item %d. #items in list: %d&quot;</span><span class="o">,</span> <span class="n">position</span><span class="o">,</span> <span class="n">getCount</span><span class="o">()));</span></div><div class='line' id='LC1026'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1027'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">childView</span> <span class="o">=</span> <span class="n">getChildAt</span><span class="o">(</span><span class="n">position</span> <span class="o">-</span> <span class="n">getFirstVisiblePosition</span><span class="o">());</span></div><div class='line' id='LC1028'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">view</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC1029'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mSwipingLayout</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1030'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">view</span> <span class="o">=</span> <span class="n">childView</span><span class="o">.</span><span class="na">findViewById</span><span class="o">(</span><span class="n">mSwipingLayout</span><span class="o">);</span></div><div class='line' id='LC1031'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1032'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">view</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1033'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">view</span> <span class="o">=</span> <span class="n">childView</span><span class="o">;</span></div><div class='line' id='LC1034'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1035'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">slideOutView</span><span class="o">(</span><span class="n">view</span><span class="o">,</span> <span class="n">childView</span><span class="o">,</span> <span class="n">position</span><span class="o">,</span> <span class="kc">true</span><span class="o">);</span></div><div class='line' id='LC1036'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1037'><br/></div><div class='line' id='LC1038'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1039'><span class="cm">     * Slide out a view to the right or left of the list. After the animation has finished, the</span></div><div class='line' id='LC1040'><span class="cm">     * view will be dismissed by calling {@link #performDismiss(android.view.View, android.view.View, int)}.</span></div><div class='line' id='LC1041'><span class="cm">     *</span></div><div class='line' id='LC1042'><span class="cm">     * @param view The view, that should be slided out.</span></div><div class='line' id='LC1043'><span class="cm">     * @param childView The whole view of the list item.</span></div><div class='line' id='LC1044'><span class="cm">     * @param position The item position of the item.</span></div><div class='line' id='LC1045'><span class="cm">     * @param toRightSide Whether it should slide out to the right side.</span></div><div class='line' id='LC1046'><span class="cm">     */</span></div><div class='line' id='LC1047'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">slideOutView</span><span class="o">(</span><span class="kd">final</span> <span class="n">View</span> <span class="n">view</span><span class="o">,</span> <span class="kd">final</span> <span class="n">View</span> <span class="n">childView</span><span class="o">,</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">position</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">toRightSide</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1048'><br/></div><div class='line' id='LC1049'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Only start new animation, if this view isn&#39;t already animated (too fast swiping bug)</span></div><div class='line' id='LC1050'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">synchronized</span><span class="o">(</span><span class="n">mAnimationLock</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1051'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mAnimatedViews</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="n">view</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1052'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC1053'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1054'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">++</span><span class="n">mDismissAnimationRefCount</span><span class="o">;</span></div><div class='line' id='LC1055'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAnimatedViews</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">view</span><span class="o">);</span></div><div class='line' id='LC1056'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1057'><br/></div><div class='line' id='LC1058'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ViewPropertyAnimator</span><span class="o">.</span><span class="na">animate</span><span class="o">(</span><span class="n">view</span><span class="o">)</span></div><div class='line' id='LC1059'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">translationX</span><span class="o">(</span><span class="n">toRightSide</span> <span class="o">?</span> <span class="n">mViewWidth</span> <span class="o">:</span> <span class="o">-</span><span class="n">mViewWidth</span><span class="o">)</span></div><div class='line' id='LC1060'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">alpha</span><span class="o">(</span><span class="mi">0</span><span class="o">)</span></div><div class='line' id='LC1061'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">setDuration</span><span class="o">(</span><span class="n">mAnimationTime</span><span class="o">)</span></div><div class='line' id='LC1062'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">setListener</span><span class="o">(</span><span class="k">new</span> <span class="n">AnimatorListenerAdapter</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC1063'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC1064'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onAnimationEnd</span><span class="o">(</span><span class="n">Animator</span> <span class="n">animation</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1065'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">performDismiss</span><span class="o">(</span><span class="n">view</span><span class="o">,</span> <span class="n">childView</span><span class="o">,</span> <span class="n">position</span><span class="o">);</span></div><div class='line' id='LC1066'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1067'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">});</span></div><div class='line' id='LC1068'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1069'><br/></div><div class='line' id='LC1070'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC1071'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">onTouchEvent</span><span class="o">(</span><span class="n">MotionEvent</span> <span class="n">ev</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1072'><br/></div><div class='line' id='LC1073'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">mSwipeEnabled</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">mRearrangingEnabled</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1074'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kd">super</span><span class="o">.</span><span class="na">onTouchEvent</span><span class="o">(</span><span class="n">ev</span><span class="o">);</span></div><div class='line' id='LC1075'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1076'><br/></div><div class='line' id='LC1077'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Send a delayed message to hide popup</span></div><div class='line' id='LC1078'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mTouchBeforeAutoHide</span> <span class="o">&amp;&amp;</span> <span class="n">mUndoPopup</span><span class="o">.</span><span class="na">isShowing</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1079'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHideUndoHandler</span><span class="o">.</span><span class="na">sendMessageDelayed</span><span class="o">(</span><span class="n">mHideUndoHandler</span><span class="o">.</span><span class="na">obtainMessage</span><span class="o">(</span><span class="n">mValidDelayedMsgId</span><span class="o">),</span> <span class="n">mUndoHideDelay</span><span class="o">);</span></div><div class='line' id='LC1080'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1081'><br/></div><div class='line' id='LC1082'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Store width of this list for usage of swipe distance detection</span></div><div class='line' id='LC1083'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mViewWidth</span> <span class="o">&lt;</span> <span class="mi">2</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1084'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mViewWidth</span> <span class="o">=</span> <span class="n">getWidth</span><span class="o">();</span></div><div class='line' id='LC1085'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1086'><br/></div><div class='line' id='LC1087'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">switch</span> <span class="o">(</span><span class="n">ev</span><span class="o">.</span><span class="na">getActionMasked</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1088'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="n">MotionEvent</span><span class="o">.</span><span class="na">ACTION_CANCEL</span><span class="o">:</span></div><div class='line' id='LC1089'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">touchEventsCancelled</span><span class="o">();</span></div><div class='line' id='LC1090'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1091'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="n">MotionEvent</span><span class="o">.</span><span class="na">ACTION_DOWN</span><span class="o">:</span></div><div class='line' id='LC1092'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mDownX</span> <span class="o">=</span> <span class="o">(</span><span class="kt">int</span><span class="o">)</span><span class="n">ev</span><span class="o">.</span><span class="na">getX</span><span class="o">();</span></div><div class='line' id='LC1093'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mDownY</span> <span class="o">=</span> <span class="o">(</span><span class="kt">int</span><span class="o">)</span><span class="n">ev</span><span class="o">.</span><span class="na">getY</span><span class="o">();</span></div><div class='line' id='LC1094'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mActivePointerId</span> <span class="o">=</span> <span class="n">ev</span><span class="o">.</span><span class="na">getPointerId</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC1095'><br/></div><div class='line' id='LC1096'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mSwipePaused</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1097'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kd">super</span><span class="o">.</span><span class="na">onTouchEvent</span><span class="o">(</span><span class="n">ev</span><span class="o">);</span></div><div class='line' id='LC1098'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1099'><br/></div><div class='line' id='LC1100'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// TODO: ensure this is a finger, and set a flag</span></div><div class='line' id='LC1101'><br/></div><div class='line' id='LC1102'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Find the child view that was touched (perform a hit test)</span></div><div class='line' id='LC1103'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Rect</span> <span class="n">rect</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Rect</span><span class="o">();</span></div><div class='line' id='LC1104'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">childCount</span> <span class="o">=</span> <span class="n">getChildCount</span><span class="o">();</span></div><div class='line' id='LC1105'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span><span class="o">[]</span> <span class="n">listViewCoords</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">int</span><span class="o">[</span><span class="mi">2</span><span class="o">];</span></div><div class='line' id='LC1106'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">getLocationOnScreen</span><span class="o">(</span><span class="n">listViewCoords</span><span class="o">);</span></div><div class='line' id='LC1107'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">x</span> <span class="o">=</span> <span class="o">(</span><span class="kt">int</span><span class="o">)</span> <span class="n">ev</span><span class="o">.</span><span class="na">getRawX</span><span class="o">()</span> <span class="o">-</span> <span class="n">listViewCoords</span><span class="o">[</span><span class="mi">0</span><span class="o">];</span></div><div class='line' id='LC1108'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">y</span> <span class="o">=</span> <span class="o">(</span><span class="kt">int</span><span class="o">)</span> <span class="n">ev</span><span class="o">.</span><span class="na">getRawY</span><span class="o">()</span> <span class="o">-</span> <span class="n">listViewCoords</span><span class="o">[</span><span class="mi">1</span><span class="o">];</span></div><div class='line' id='LC1109'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">child</span><span class="o">;</span></div><div class='line' id='LC1110'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">getHeaderViewsCount</span><span class="o">();</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">childCount</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></div><div class='line' id='LC1111'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">child</span> <span class="o">=</span> <span class="n">getChildAt</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC1112'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">child</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1113'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">child</span><span class="o">.</span><span class="na">getHitRect</span><span class="o">(</span><span class="n">rect</span><span class="o">);</span></div><div class='line' id='LC1114'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">rect</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="n">x</span><span class="o">,</span> <span class="n">y</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1115'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// if a specific swiping layout has been giving, use this to swipe.</span></div><div class='line' id='LC1116'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mSwipingLayout</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1117'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">View</span> <span class="n">swipingView</span> <span class="o">=</span> <span class="n">child</span><span class="o">.</span><span class="na">findViewById</span><span class="o">(</span><span class="n">mSwipingLayout</span><span class="o">);</span></div><div class='line' id='LC1118'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">swipingView</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1119'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipeDownView</span> <span class="o">=</span> <span class="n">swipingView</span><span class="o">;</span></div><div class='line' id='LC1120'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipeDownChild</span> <span class="o">=</span> <span class="n">child</span><span class="o">;</span></div><div class='line' id='LC1121'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1122'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1123'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1124'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// If no swiping layout has been found, swipe the whole child</span></div><div class='line' id='LC1125'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipeDownView</span> <span class="o">=</span> <span class="n">mSwipeDownChild</span> <span class="o">=</span> <span class="n">child</span><span class="o">;</span></div><div class='line' id='LC1126'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1127'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1128'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1129'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1130'><br/></div><div class='line' id='LC1131'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mSwipeDownView</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1132'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mDownX</span> <span class="o">=</span> <span class="n">ev</span><span class="o">.</span><span class="na">getRawX</span><span class="o">();</span></div><div class='line' id='LC1133'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mDownPosition</span> <span class="o">=</span> <span class="n">getPositionForView</span><span class="o">(</span><span class="n">mSwipeDownView</span><span class="o">)</span> <span class="o">-</span> <span class="n">getHeaderViewsCount</span><span class="o">();</span></div><div class='line' id='LC1134'><br/></div><div class='line' id='LC1135'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mVelocityTracker</span> <span class="o">=</span> <span class="n">VelocityTracker</span><span class="o">.</span><span class="na">obtain</span><span class="o">();</span></div><div class='line' id='LC1136'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mVelocityTracker</span><span class="o">.</span><span class="na">addMovement</span><span class="o">(</span><span class="n">ev</span><span class="o">);</span></div><div class='line' id='LC1137'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1138'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">super</span><span class="o">.</span><span class="na">onTouchEvent</span><span class="o">(</span><span class="n">ev</span><span class="o">);</span></div><div class='line' id='LC1139'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC1140'><br/></div><div class='line' id='LC1141'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="n">MotionEvent</span><span class="o">.</span><span class="na">ACTION_UP</span><span class="o">:</span> <span class="o">{</span></div><div class='line' id='LC1142'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">touchEventsEnded</span><span class="o">();</span></div><div class='line' id='LC1143'><br/></div><div class='line' id='LC1144'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mVelocityTracker</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1145'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1146'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1147'><br/></div><div class='line' id='LC1148'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">float</span> <span class="n">deltaX</span> <span class="o">=</span> <span class="n">ev</span><span class="o">.</span><span class="na">getRawX</span><span class="o">()</span> <span class="o">-</span> <span class="n">mDownX</span><span class="o">;</span></div><div class='line' id='LC1149'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mVelocityTracker</span><span class="o">.</span><span class="na">addMovement</span><span class="o">(</span><span class="n">ev</span><span class="o">);</span></div><div class='line' id='LC1150'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mVelocityTracker</span><span class="o">.</span><span class="na">computeCurrentVelocity</span><span class="o">(</span><span class="mi">1000</span><span class="o">);</span></div><div class='line' id='LC1151'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">float</span> <span class="n">velocityX</span> <span class="o">=</span> <span class="n">Math</span><span class="o">.</span><span class="na">abs</span><span class="o">(</span><span class="n">mVelocityTracker</span><span class="o">.</span><span class="na">getXVelocity</span><span class="o">());</span></div><div class='line' id='LC1152'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">float</span> <span class="n">velocityY</span> <span class="o">=</span> <span class="n">Math</span><span class="o">.</span><span class="na">abs</span><span class="o">(</span><span class="n">mVelocityTracker</span><span class="o">.</span><span class="na">getYVelocity</span><span class="o">());</span></div><div class='line' id='LC1153'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">dismiss</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1154'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">dismissRight</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1155'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">Math</span><span class="o">.</span><span class="na">abs</span><span class="o">(</span><span class="n">deltaX</span><span class="o">)</span> <span class="o">&gt;</span> <span class="n">mViewWidth</span> <span class="o">/</span> <span class="mi">2</span> <span class="o">&amp;&amp;</span> <span class="n">mSwiping</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1156'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">dismiss</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC1157'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">dismissRight</span> <span class="o">=</span> <span class="n">deltaX</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC1158'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span> <span class="o">(</span><span class="n">mMinFlingVelocity</span> <span class="o">&lt;=</span> <span class="n">velocityX</span> <span class="o">&amp;&amp;</span> <span class="n">velocityX</span> <span class="o">&lt;=</span> <span class="n">mMaxFlingVelocity</span></div><div class='line' id='LC1159'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">&amp;&amp;</span> <span class="n">velocityY</span> <span class="o">&lt;</span> <span class="n">velocityX</span> <span class="o">&amp;&amp;</span> <span class="n">mSwiping</span> <span class="o">&amp;&amp;</span> <span class="n">isSwipeDirectionValid</span><span class="o">(</span><span class="n">mVelocityTracker</span><span class="o">.</span><span class="na">getXVelocity</span><span class="o">())</span></div><div class='line' id='LC1160'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">&amp;&amp;</span> <span class="n">deltaX</span> <span class="o">&gt;=</span> <span class="n">mViewWidth</span> <span class="o">*</span> <span class="mf">0.2f</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1161'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">dismiss</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC1162'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">dismissRight</span> <span class="o">=</span> <span class="n">mVelocityTracker</span><span class="o">.</span><span class="na">getXVelocity</span><span class="o">()</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC1163'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1164'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">dismiss</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1165'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// dismiss</span></div><div class='line' id='LC1166'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">slideOutView</span><span class="o">(</span><span class="n">mSwipeDownView</span><span class="o">,</span> <span class="n">mSwipeDownChild</span><span class="o">,</span> <span class="n">mDownPosition</span><span class="o">,</span> <span class="n">dismissRight</span><span class="o">);</span></div><div class='line' id='LC1167'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span><span class="o">(</span><span class="n">mSwiping</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1168'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Swipe back to regular position</span></div><div class='line' id='LC1169'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ViewPropertyAnimator</span><span class="o">.</span><span class="na">animate</span><span class="o">(</span><span class="n">mSwipeDownView</span><span class="o">)</span></div><div class='line' id='LC1170'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">translationX</span><span class="o">(</span><span class="mi">0</span><span class="o">)</span></div><div class='line' id='LC1171'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">alpha</span><span class="o">(</span><span class="mi">1</span><span class="o">)</span></div><div class='line' id='LC1172'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">setDuration</span><span class="o">(</span><span class="n">mAnimationTime</span><span class="o">)</span></div><div class='line' id='LC1173'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">.</span><span class="na">setListener</span><span class="o">(</span><span class="kc">null</span><span class="o">);</span></div><div class='line' id='LC1174'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1175'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mVelocityTracker</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC1176'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mDownX</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC1177'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipeDownView</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC1178'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwipeDownChild</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC1179'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mDownPosition</span> <span class="o">=</span> <span class="n">AbsListView</span><span class="o">.</span><span class="na">INVALID_POSITION</span><span class="o">;</span></div><div class='line' id='LC1180'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwiping</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1181'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1182'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1183'><br/></div><div class='line' id='LC1184'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="n">MotionEvent</span><span class="o">.</span><span class="na">ACTION_MOVE</span><span class="o">:</span> <span class="o">{</span></div><div class='line' id='LC1185'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!(</span><span class="n">mVelocityTracker</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">mSwipePaused</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">mCellIsMobile</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1186'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mVelocityTracker</span><span class="o">.</span><span class="na">addMovement</span><span class="o">(</span><span class="n">ev</span><span class="o">);</span></div><div class='line' id='LC1187'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">float</span> <span class="n">deltaX</span> <span class="o">=</span> <span class="n">ev</span><span class="o">.</span><span class="na">getRawX</span><span class="o">()</span> <span class="o">-</span> <span class="n">mDownX</span><span class="o">;</span></div><div class='line' id='LC1188'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Only start swipe in correct direction</span></div><div class='line' id='LC1189'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">isSwipeDirectionValid</span><span class="o">(</span><span class="n">deltaX</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC1190'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">Math</span><span class="o">.</span><span class="na">abs</span><span class="o">(</span><span class="n">deltaX</span><span class="o">)</span> <span class="o">&gt;</span> <span class="n">mSlop</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1191'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mSwiping</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC1192'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">requestDisallowInterceptTouchEvent</span><span class="o">(</span><span class="kc">true</span><span class="o">);</span></div><div class='line' id='LC1193'><br/></div><div class='line' id='LC1194'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Cancel ListView&#39;s touch (un-highlighting the item)</span></div><div class='line' id='LC1195'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">MotionEvent</span> <span class="n">cancelEvent</span> <span class="o">=</span> <span class="n">MotionEvent</span><span class="o">.</span><span class="na">obtain</span><span class="o">(</span><span class="n">ev</span><span class="o">);</span></div><div class='line' id='LC1196'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">cancelEvent</span><span class="o">.</span><span class="na">setAction</span><span class="o">(</span><span class="n">MotionEvent</span><span class="o">.</span><span class="na">ACTION_CANCEL</span></div><div class='line' id='LC1197'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">|</span> <span class="o">(</span><span class="n">ev</span><span class="o">.</span><span class="na">getActionIndex</span><span class="o">()</span></div><div class='line' id='LC1198'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">&lt;&lt;</span> <span class="n">MotionEvent</span><span class="o">.</span><span class="na">ACTION_POINTER_INDEX_SHIFT</span><span class="o">));</span></div><div class='line' id='LC1199'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">super</span><span class="o">.</span><span class="na">onTouchEvent</span><span class="o">(</span><span class="n">cancelEvent</span><span class="o">);</span></div><div class='line' id='LC1200'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1201'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC1202'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// If we swiped into wrong direction, act like this was the new</span></div><div class='line' id='LC1203'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// touch down point</span></div><div class='line' id='LC1204'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mDownX</span> <span class="o">=</span> <span class="n">ev</span><span class="o">.</span><span class="na">getRawX</span><span class="o">();</span></div><div class='line' id='LC1205'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">deltaX</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC1206'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1207'><br/></div><div class='line' id='LC1208'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mSwiping</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1209'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ViewHelper</span><span class="o">.</span><span class="na">setTranslationX</span><span class="o">(</span><span class="n">mSwipeDownView</span><span class="o">,</span> <span class="n">deltaX</span><span class="o">);</span></div><div class='line' id='LC1210'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ViewHelper</span><span class="o">.</span><span class="na">setAlpha</span><span class="o">(</span><span class="n">mSwipeDownView</span><span class="o">,</span> <span class="n">Math</span><span class="o">.</span><span class="na">max</span><span class="o">(</span><span class="mi">0</span><span class="n">f</span><span class="o">,</span> <span class="n">Math</span><span class="o">.</span><span class="na">min</span><span class="o">(</span><span class="mi">1</span><span class="n">f</span><span class="o">,</span></div><div class='line' id='LC1211'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mi">1</span><span class="n">f</span> <span class="o">-</span> <span class="mi">2</span><span class="n">f</span> <span class="o">*</span> <span class="n">Math</span><span class="o">.</span><span class="na">abs</span><span class="o">(</span><span class="n">deltaX</span><span class="o">)</span> <span class="o">/</span> <span class="n">mViewWidth</span><span class="o">)));</span></div><div class='line' id='LC1212'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC1213'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1214'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1215'><br/></div><div class='line' id='LC1216'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mActivePointerId</span> <span class="o">!=</span> <span class="n">INVALID_POINTER_ID</span><span class="o">){</span></div><div class='line' id='LC1217'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">pointerIndex</span> <span class="o">=</span> <span class="n">ev</span><span class="o">.</span><span class="na">findPointerIndex</span><span class="o">(</span><span class="n">mActivePointerId</span><span class="o">);</span></div><div class='line' id='LC1218'><br/></div><div class='line' id='LC1219'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mLastEventY</span> <span class="o">=</span> <span class="o">(</span><span class="kt">int</span><span class="o">)</span> <span class="n">ev</span><span class="o">.</span><span class="na">getY</span><span class="o">(</span><span class="n">pointerIndex</span><span class="o">);</span></div><div class='line' id='LC1220'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">deltaY</span> <span class="o">=</span> <span class="n">mLastEventY</span> <span class="o">-</span> <span class="n">mDownY</span><span class="o">;</span></div><div class='line' id='LC1221'><br/></div><div class='line' id='LC1222'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">mCellIsMobile</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1223'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCellCurrentBounds</span><span class="o">.</span><span class="na">offsetTo</span><span class="o">(</span><span class="n">mHoverCellOriginalBounds</span><span class="o">.</span><span class="na">left</span><span class="o">,</span></div><div class='line' id='LC1224'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCellOriginalBounds</span><span class="o">.</span><span class="na">top</span> <span class="o">+</span> <span class="n">deltaY</span> <span class="o">+</span> <span class="n">mTotalOffset</span><span class="o">);</span></div><div class='line' id='LC1225'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHoverCell</span><span class="o">.</span><span class="na">setBounds</span><span class="o">(</span><span class="n">mHoverCellCurrentBounds</span><span class="o">);</span></div><div class='line' id='LC1226'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">invalidate</span><span class="o">();</span></div><div class='line' id='LC1227'><br/></div><div class='line' id='LC1228'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">handleCellSwitch</span><span class="o">();</span></div><div class='line' id='LC1229'><br/></div><div class='line' id='LC1230'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mIsMobileScrolling</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1231'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">handleMobileCellScroll</span><span class="o">();</span></div><div class='line' id='LC1232'><br/></div><div class='line' id='LC1233'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC1234'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1235'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1236'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1237'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1238'><br/></div><div class='line' id='LC1239'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="n">MotionEvent</span><span class="o">.</span><span class="na">ACTION_POINTER_UP</span><span class="o">:</span></div><div class='line' id='LC1240'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/* If a multitouch event took place and the original touch dictating</span></div><div class='line' id='LC1241'><span class="cm">                 * the movement of the hover cell has ended, then the dragging event</span></div><div class='line' id='LC1242'><span class="cm">                 * ends and the hover cell is animated to its corresponding position</span></div><div class='line' id='LC1243'><span class="cm">                 * in the listview. */</span></div><div class='line' id='LC1244'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">pointerIndex</span> <span class="o">=</span> <span class="o">(</span><span class="n">ev</span><span class="o">.</span><span class="na">getAction</span><span class="o">()</span> <span class="o">&amp;</span> <span class="n">MotionEvent</span><span class="o">.</span><span class="na">ACTION_POINTER_INDEX_MASK</span><span class="o">)</span> <span class="o">&gt;&gt;</span></div><div class='line' id='LC1245'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">MotionEvent</span><span class="o">.</span><span class="na">ACTION_POINTER_INDEX_SHIFT</span><span class="o">;</span></div><div class='line' id='LC1246'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kt">int</span> <span class="n">pointerId</span> <span class="o">=</span> <span class="n">ev</span><span class="o">.</span><span class="na">getPointerId</span><span class="o">(</span><span class="n">pointerIndex</span><span class="o">);</span></div><div class='line' id='LC1247'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">pointerId</span> <span class="o">==</span> <span class="n">mActivePointerId</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1248'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">touchEventsEnded</span><span class="o">();</span></div><div class='line' id='LC1249'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1250'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">break</span><span class="o">;</span></div><div class='line' id='LC1251'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1252'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kd">super</span><span class="o">.</span><span class="na">onTouchEvent</span><span class="o">(</span><span class="n">ev</span><span class="o">);</span></div><div class='line' id='LC1253'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1254'><br/></div><div class='line' id='LC1255'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1256'><span class="cm">     * Animate the dismissed list item to zero-height and fire the dismiss callback when</span></div><div class='line' id='LC1257'><span class="cm">     * all dismissed list item animations have completed.</span></div><div class='line' id='LC1258'><span class="cm">     *</span></div><div class='line' id='LC1259'><span class="cm">     * @param dismissView The view that has been slided out.</span></div><div class='line' id='LC1260'><span class="cm">     * @param listItemView The list item view. This is the whole view of the list item, and not just</span></div><div class='line' id='LC1261'><span class="cm">     *                     the part, that the user swiped.</span></div><div class='line' id='LC1262'><span class="cm">     * @param dismissPosition The position of the view inside the list.</span></div><div class='line' id='LC1263'><span class="cm">     */</span></div><div class='line' id='LC1264'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">performDismiss</span><span class="o">(</span><span class="kd">final</span> <span class="n">View</span> <span class="n">dismissView</span><span class="o">,</span> <span class="kd">final</span> <span class="n">View</span> <span class="n">listItemView</span><span class="o">,</span> <span class="kd">final</span> <span class="kt">int</span> <span class="n">dismissPosition</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1265'><br/></div><div class='line' id='LC1266'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="n">ViewGroup</span><span class="o">.</span><span class="na">LayoutParams</span> <span class="n">lp</span> <span class="o">=</span> <span class="n">listItemView</span><span class="o">.</span><span class="na">getLayoutParams</span><span class="o">();</span></div><div class='line' id='LC1267'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">final</span> <span class="kt">int</span> <span class="n">originalLayoutHeight</span> <span class="o">=</span> <span class="n">lp</span><span class="o">.</span><span class="na">height</span><span class="o">;</span></div><div class='line' id='LC1268'><br/></div><div class='line' id='LC1269'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">originalHeight</span> <span class="o">=</span> <span class="n">listItemView</span><span class="o">.</span><span class="na">getHeight</span><span class="o">();</span></div><div class='line' id='LC1270'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ValueAnimator</span> <span class="n">animator</span> <span class="o">=</span> <span class="n">ValueAnimator</span><span class="o">.</span><span class="na">ofInt</span><span class="o">(</span><span class="n">originalHeight</span><span class="o">,</span> <span class="mi">1</span><span class="o">).</span><span class="na">setDuration</span><span class="o">(</span><span class="n">mAnimationTime</span><span class="o">);</span></div><div class='line' id='LC1271'><br/></div><div class='line' id='LC1272'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">animator</span><span class="o">.</span><span class="na">addListener</span><span class="o">(</span><span class="k">new</span> <span class="n">AnimatorListenerAdapter</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC1273'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC1274'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onAnimationEnd</span><span class="o">(</span><span class="n">Animator</span> <span class="n">animation</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1275'><br/></div><div class='line' id='LC1276'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Make sure no other animation is running. Remove animation from running list, that just finished</span></div><div class='line' id='LC1277'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">boolean</span> <span class="n">noAnimationLeft</span><span class="o">;</span></div><div class='line' id='LC1278'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">synchronized</span><span class="o">(</span><span class="n">mAnimationLock</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1279'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">--</span><span class="n">mDismissAnimationRefCount</span><span class="o">;</span></div><div class='line' id='LC1280'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mAnimatedViews</span><span class="o">.</span><span class="na">remove</span><span class="o">(</span><span class="n">dismissView</span><span class="o">);</span></div><div class='line' id='LC1281'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">noAnimationLeft</span> <span class="o">=</span> <span class="n">mDismissAnimationRefCount</span> <span class="o">==</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC1282'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1283'><br/></div><div class='line' id='LC1284'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">noAnimationLeft</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1285'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// No active animations, process all pending dismisses.</span></div><div class='line' id='LC1286'><br/></div><div class='line' id='LC1287'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span><span class="o">(</span><span class="n">PendingDismissData</span> <span class="n">dismiss</span> <span class="o">:</span> <span class="n">mPendingDismisses</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1288'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mUndoStyle</span> <span class="o">==</span> <span class="n">UndoStyle</span><span class="o">.</span><span class="na">SINGLE_POPUP</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1289'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span><span class="o">(</span><span class="n">Undoable</span> <span class="n">undoable</span> <span class="o">:</span> <span class="n">mUndoActions</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1290'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">undoable</span><span class="o">.</span><span class="na">discard</span><span class="o">();</span></div><div class='line' id='LC1291'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1292'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoActions</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></div><div class='line' id='LC1293'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1294'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Undoable</span> <span class="n">undoable</span> <span class="o">=</span> <span class="n">mDismissCallback</span><span class="o">.</span><span class="na">onDismiss</span><span class="o">(</span><span class="n">EnhancedListView</span><span class="o">.</span><span class="na">this</span><span class="o">,</span> <span class="n">dismiss</span><span class="o">.</span><span class="na">position</span><span class="o">);</span></div><div class='line' id='LC1295'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">undoable</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1296'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoActions</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">undoable</span><span class="o">);</span></div><div class='line' id='LC1297'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1298'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mValidDelayedMsgId</span><span class="o">++;</span></div><div class='line' id='LC1299'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1300'><br/></div><div class='line' id='LC1301'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(!</span><span class="n">mUndoActions</span><span class="o">.</span><span class="na">isEmpty</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC1302'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">changePopupText</span><span class="o">();</span></div><div class='line' id='LC1303'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">changeButtonLabel</span><span class="o">();</span></div><div class='line' id='LC1304'><br/></div><div class='line' id='LC1305'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Show undo popup</span></div><div class='line' id='LC1306'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopup</span><span class="o">.</span><span class="na">setWidth</span><span class="o">((</span><span class="kt">int</span><span class="o">)</span><span class="n">Math</span><span class="o">.</span><span class="na">min</span><span class="o">(</span><span class="n">mScreenDensity</span> <span class="o">*</span> <span class="mi">400</span><span class="o">,</span> <span class="n">getWidth</span><span class="o">()</span> <span class="o">*</span> <span class="mf">0.9f</span><span class="o">));</span></div><div class='line' id='LC1307'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopup</span><span class="o">.</span><span class="na">showAtLocation</span><span class="o">(</span><span class="n">EnhancedListView</span><span class="o">.</span><span class="na">this</span><span class="o">,</span></div><div class='line' id='LC1308'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Gravity</span><span class="o">.</span><span class="na">CENTER_HORIZONTAL</span> <span class="o">|</span> <span class="n">Gravity</span><span class="o">.</span><span class="na">BOTTOM</span><span class="o">,</span></div><div class='line' id='LC1309'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mi">0</span><span class="o">,</span> <span class="o">(</span><span class="kt">int</span><span class="o">)(</span><span class="n">mScreenDensity</span> <span class="o">*</span> <span class="mi">15</span><span class="o">));</span></div><div class='line' id='LC1310'><br/></div><div class='line' id='LC1311'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Queue the dismiss only if required</span></div><div class='line' id='LC1312'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(!</span><span class="n">mTouchBeforeAutoHide</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1313'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Send a delayed message to hide popup</span></div><div class='line' id='LC1314'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mHideUndoHandler</span><span class="o">.</span><span class="na">sendMessageDelayed</span><span class="o">(</span><span class="n">mHideUndoHandler</span><span class="o">.</span><span class="na">obtainMessage</span><span class="o">(</span><span class="n">mValidDelayedMsgId</span><span class="o">),</span></div><div class='line' id='LC1315'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoHideDelay</span><span class="o">);</span></div><div class='line' id='LC1316'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1317'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1318'><br/></div><div class='line' id='LC1319'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ViewGroup</span><span class="o">.</span><span class="na">LayoutParams</span> <span class="n">lp</span><span class="o">;</span></div><div class='line' id='LC1320'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">for</span> <span class="o">(</span><span class="n">PendingDismissData</span> <span class="n">pendingDismiss</span> <span class="o">:</span> <span class="n">mPendingDismisses</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1321'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ViewHelper</span><span class="o">.</span><span class="na">setAlpha</span><span class="o">(</span><span class="n">pendingDismiss</span><span class="o">.</span><span class="na">view</span><span class="o">,</span> <span class="mi">1</span><span class="n">f</span><span class="o">);</span></div><div class='line' id='LC1322'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">ViewHelper</span><span class="o">.</span><span class="na">setTranslationX</span><span class="o">(</span><span class="n">pendingDismiss</span><span class="o">.</span><span class="na">view</span><span class="o">,</span> <span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC1323'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">lp</span> <span class="o">=</span> <span class="n">pendingDismiss</span><span class="o">.</span><span class="na">childView</span><span class="o">.</span><span class="na">getLayoutParams</span><span class="o">();</span></div><div class='line' id='LC1324'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">lp</span><span class="o">.</span><span class="na">height</span> <span class="o">=</span> <span class="n">originalLayoutHeight</span><span class="o">;</span></div><div class='line' id='LC1325'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">pendingDismiss</span><span class="o">.</span><span class="na">childView</span><span class="o">.</span><span class="na">setLayoutParams</span><span class="o">(</span><span class="n">lp</span><span class="o">);</span></div><div class='line' id='LC1326'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1327'><br/></div><div class='line' id='LC1328'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mPendingDismisses</span><span class="o">.</span><span class="na">clear</span><span class="o">();</span></div><div class='line' id='LC1329'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1330'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1331'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">});</span></div><div class='line' id='LC1332'><br/></div><div class='line' id='LC1333'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">animator</span><span class="o">.</span><span class="na">addUpdateListener</span><span class="o">(</span><span class="k">new</span> <span class="n">ValueAnimator</span><span class="o">.</span><span class="na">AnimatorUpdateListener</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC1334'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC1335'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">void</span> <span class="nf">onAnimationUpdate</span><span class="o">(</span><span class="n">ValueAnimator</span> <span class="n">valueAnimator</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1336'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">lp</span><span class="o">.</span><span class="na">height</span> <span class="o">=</span> <span class="o">(</span><span class="n">Integer</span><span class="o">)</span> <span class="n">valueAnimator</span><span class="o">.</span><span class="na">getAnimatedValue</span><span class="o">();</span></div><div class='line' id='LC1337'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">listItemView</span><span class="o">.</span><span class="na">setLayoutParams</span><span class="o">(</span><span class="n">lp</span><span class="o">);</span></div><div class='line' id='LC1338'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1339'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">});</span></div><div class='line' id='LC1340'><br/></div><div class='line' id='LC1341'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mPendingDismisses</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="k">new</span> <span class="n">PendingDismissData</span><span class="o">(</span><span class="n">dismissPosition</span><span class="o">,</span> <span class="n">dismissView</span><span class="o">,</span> <span class="n">listItemView</span><span class="o">));</span></div><div class='line' id='LC1342'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">animator</span><span class="o">.</span><span class="na">start</span><span class="o">();</span></div><div class='line' id='LC1343'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1344'><br/></div><div class='line' id='LC1345'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1346'><span class="cm">     * Changes the text of the undo popup. If more then one item can be undone, the number of deleted</span></div><div class='line' id='LC1347'><span class="cm">     * items will be shown. If only one deletion can be undone, the title of this deletion (or a default</span></div><div class='line' id='LC1348'><span class="cm">     * string in case the title is {@code null}) will be shown.</span></div><div class='line' id='LC1349'><span class="cm">     */</span></div><div class='line' id='LC1350'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">changePopupText</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC1351'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">msg</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC1352'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mUndoActions</span><span class="o">.</span><span class="na">size</span><span class="o">()</span> <span class="o">&gt;</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1353'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">msg</span> <span class="o">=</span> <span class="n">getResources</span><span class="o">().</span><span class="na">getString</span><span class="o">(</span><span class="n">R</span><span class="o">.</span><span class="na">string</span><span class="o">.</span><span class="na">n_items_deleted</span><span class="o">,</span> <span class="n">mUndoActions</span><span class="o">.</span><span class="na">size</span><span class="o">());</span></div><div class='line' id='LC1354'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span><span class="o">(</span><span class="n">mUndoActions</span><span class="o">.</span><span class="na">size</span><span class="o">()</span> <span class="o">&gt;=</span> <span class="mi">1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1355'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Set title from single undoable or when no multiple deletion string</span></div><div class='line' id='LC1356'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// is given</span></div><div class='line' id='LC1357'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">msg</span> <span class="o">=</span> <span class="n">mUndoActions</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">mUndoActions</span><span class="o">.</span><span class="na">size</span><span class="o">()</span> <span class="o">-</span> <span class="mi">1</span><span class="o">).</span><span class="na">getTitle</span><span class="o">();</span></div><div class='line' id='LC1358'><br/></div><div class='line' id='LC1359'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">msg</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1360'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">msg</span> <span class="o">=</span> <span class="n">getResources</span><span class="o">().</span><span class="na">getString</span><span class="o">(</span><span class="n">R</span><span class="o">.</span><span class="na">string</span><span class="o">.</span><span class="na">item_deleted</span><span class="o">);</span></div><div class='line' id='LC1361'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1362'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1363'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoPopupTextView</span><span class="o">.</span><span class="na">setText</span><span class="o">(</span><span class="n">msg</span><span class="o">);</span></div><div class='line' id='LC1364'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1365'><br/></div><div class='line' id='LC1366'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1367'><span class="cm">     * Changes the label of the undo button.</span></div><div class='line' id='LC1368'><span class="cm">     */</span></div><div class='line' id='LC1369'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">changeButtonLabel</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC1370'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">msg</span><span class="o">;</span></div><div class='line' id='LC1371'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">mUndoActions</span><span class="o">.</span><span class="na">size</span><span class="o">()</span> <span class="o">&gt;</span> <span class="mi">1</span> <span class="o">&amp;&amp;</span> <span class="n">mUndoStyle</span> <span class="o">==</span> <span class="n">UndoStyle</span><span class="o">.</span><span class="na">COLLAPSED_POPUP</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1372'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">msg</span> <span class="o">=</span> <span class="n">getResources</span><span class="o">().</span><span class="na">getString</span><span class="o">(</span><span class="n">R</span><span class="o">.</span><span class="na">string</span><span class="o">.</span><span class="na">undo_all</span><span class="o">);</span></div><div class='line' id='LC1373'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC1374'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">msg</span> <span class="o">=</span> <span class="n">getResources</span><span class="o">().</span><span class="na">getString</span><span class="o">(</span><span class="n">R</span><span class="o">.</span><span class="na">string</span><span class="o">.</span><span class="na">undo</span><span class="o">);</span></div><div class='line' id='LC1375'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1376'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">mUndoButton</span><span class="o">.</span><span class="na">setText</span><span class="o">(</span><span class="n">msg</span><span class="o">);</span></div><div class='line' id='LC1377'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1378'><br/></div><div class='line' id='LC1379'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="cm">/**</span></div><div class='line' id='LC1380'><span class="cm">     * Checks whether the delta of a swipe indicates, that the swipe is in the</span></div><div class='line' id='LC1381'><span class="cm">     * correct direction, regarding the direction set via</span></div><div class='line' id='LC1382'><span class="cm">     * {@link #setSwipeDirection(de.timroes.android.listview.EnhancedListView.SwipeDirection)}</span></div><div class='line' id='LC1383'><span class="cm">     *</span></div><div class='line' id='LC1384'><span class="cm">     * @param deltaX The delta of x coordinate of the swipe.</span></div><div class='line' id='LC1385'><span class="cm">     * @return Whether the delta of a swipe is in the right direction.</span></div><div class='line' id='LC1386'><span class="cm">     */</span></div><div class='line' id='LC1387'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">isSwipeDirectionValid</span><span class="o">(</span><span class="kt">float</span> <span class="n">deltaX</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1388'><br/></div><div class='line' id='LC1389'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">rtlSign</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC1390'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// On API level 17 and above, check if we are in a Right-To-Left layout</span></div><div class='line' id='LC1391'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">Build</span><span class="o">.</span><span class="na">VERSION</span><span class="o">.</span><span class="na">SDK_INT</span> <span class="o">&gt;=</span> <span class="n">Build</span><span class="o">.</span><span class="na">VERSION_CODES</span><span class="o">.</span><span class="na">JELLY_BEAN_MR1</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1392'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span><span class="o">(</span><span class="n">getLayoutDirection</span><span class="o">()</span> <span class="o">==</span> <span class="n">View</span><span class="o">.</span><span class="na">LAYOUT_DIRECTION_RTL</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1393'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">rtlSign</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC1394'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1395'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1396'><br/></div><div class='line' id='LC1397'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Check if swipe has been done in the correct direction</span></div><div class='line' id='LC1398'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">switch</span><span class="o">(</span><span class="n">mSwipeDirection</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC1399'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">default</span><span class="o">:</span></div><div class='line' id='LC1400'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="nl">BOTH:</span></div><div class='line' id='LC1401'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC1402'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="nl">START:</span></div><div class='line' id='LC1403'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">rtlSign</span> <span class="o">*</span> <span class="n">deltaX</span> <span class="o">&lt;</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC1404'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">case</span> <span class="nl">END:</span></div><div class='line' id='LC1405'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="n">rtlSign</span> <span class="o">*</span> <span class="n">deltaX</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC1406'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1407'><br/></div><div class='line' id='LC1408'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC1409'><span class="o">}</span></div></pre></div>
            </td>
          </tr>
        </table>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.04056s from github-fe119-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
          <div class="suggester-container">
              <div class="suggester fullscreen-suggester js-navigation-container" id="fullscreen_suggester"
                 data-url="/schrockblock/EnhancedListView/suggestions/commit">
              </div>
          </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped leftwards" title="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped leftwards"
      title="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

  </body>
</html>


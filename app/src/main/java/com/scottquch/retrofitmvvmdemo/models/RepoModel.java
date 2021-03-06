package com.scottquch.retrofitmvvmdemo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RepoModel {
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("full_name")
        @Expose
        private String fullName;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("private")
        @Expose
        private Boolean _private;
        @SerializedName("fork")
        @Expose
        private Boolean fork;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("html_url")
        @Expose
        private String htmlUrl;
        @SerializedName("archive_url")
        @Expose
        private String archiveUrl;
        @SerializedName("assignees_url")
        @Expose
        private String assigneesUrl;
        @SerializedName("blobs_url")
        @Expose
        private String blobsUrl;
        @SerializedName("branches_url")
        @Expose
        private String branchesUrl;
        @SerializedName("clone_url")
        @Expose
        private String cloneUrl;
        @SerializedName("collaborators_url")
        @Expose
        private String collaboratorsUrl;
        @SerializedName("comments_url")
        @Expose
        private String commentsUrl;
        @SerializedName("commits_url")
        @Expose
        private String commitsUrl;
        @SerializedName("compare_url")
        @Expose
        private String compareUrl;
        @SerializedName("contents_url")
        @Expose
        private String contentsUrl;
        @SerializedName("contributors_url")
        @Expose
        private String contributorsUrl;
        @SerializedName("deployments_url")
        @Expose
        private String deploymentsUrl;
        @SerializedName("downloads_url")
        @Expose
        private String downloadsUrl;
        @SerializedName("events_url")
        @Expose
        private String eventsUrl;
        @SerializedName("forks_url")
        @Expose
        private String forksUrl;
        @SerializedName("git_commits_url")
        @Expose
        private String gitCommitsUrl;
        @SerializedName("git_refs_url")
        @Expose
        private String gitRefsUrl;
        @SerializedName("git_tags_url")
        @Expose
        private String gitTagsUrl;
        @SerializedName("git_url")
        @Expose
        private String gitUrl;
        @SerializedName("hooks_url")
        @Expose
        private String hooksUrl;
        @SerializedName("issue_comment_url")
        @Expose
        private String issueCommentUrl;
        @SerializedName("issue_events_url")
        @Expose
        private String issueEventsUrl;
        @SerializedName("issues_url")
        @Expose
        private String issuesUrl;
        @SerializedName("keys_url")
        @Expose
        private String keysUrl;
        @SerializedName("labels_url")
        @Expose
        private String labelsUrl;
        @SerializedName("languages_url")
        @Expose
        private String languagesUrl;
        @SerializedName("merges_url")
        @Expose
        private String mergesUrl;
        @SerializedName("milestones_url")
        @Expose
        private String milestonesUrl;
        @SerializedName("mirror_url")
        @Expose
        private String mirrorUrl;
        @SerializedName("notifications_url")
        @Expose
        private String notificationsUrl;
        @SerializedName("pulls_url")
        @Expose
        private String pullsUrl;
        @SerializedName("releases_url")
        @Expose
        private String releasesUrl;
        @SerializedName("ssh_url")
        @Expose
        private String sshUrl;
        @SerializedName("stargazers_url")
        @Expose
        private String stargazersUrl;
        @SerializedName("statuses_url")
        @Expose
        private String statusesUrl;
        @SerializedName("subscribers_url")
        @Expose
        private String subscribersUrl;
        @SerializedName("subscription_url")
        @Expose
        private String subscriptionUrl;
        @SerializedName("svn_url")
        @Expose
        private String svnUrl;
        @SerializedName("tags_url")
        @Expose
        private String tagsUrl;
        @SerializedName("teams_url")
        @Expose
        private String teamsUrl;
        @SerializedName("trees_url")
        @Expose
        private String treesUrl;
        @SerializedName("homepage")
        @Expose
        private String homepage;
        @SerializedName("language")
        @Expose
        private Object language;
        @SerializedName("forks_count")
        @Expose
        private Integer forksCount;
        @SerializedName("stargazers_count")
        @Expose
        private Integer stargazersCount;
        @SerializedName("watchers_count")
        @Expose
        private Integer watchersCount;
        @SerializedName("size")
        @Expose
        private Integer size;
        @SerializedName("default_branch")
        @Expose
        private String defaultBranch;
        @SerializedName("open_issues_count")
        @Expose
        private Integer openIssuesCount;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Boolean getPrivate() {
            return _private;
        }

        public void setPrivate(Boolean _private) {
            this._private = _private;
        }

        public Boolean getFork() {
            return fork;
        }

        public void setFork(Boolean fork) {
            this.fork = fork;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getArchiveUrl() {
            return archiveUrl;
        }

        public void setArchiveUrl(String archiveUrl) {
            this.archiveUrl = archiveUrl;
        }

        public String getAssigneesUrl() {
            return assigneesUrl;
        }

        public void setAssigneesUrl(String assigneesUrl) {
            this.assigneesUrl = assigneesUrl;
        }

        public String getBlobsUrl() {
            return blobsUrl;
        }

        public void setBlobsUrl(String blobsUrl) {
            this.blobsUrl = blobsUrl;
        }

        public String getBranchesUrl() {
            return branchesUrl;
        }

        public void setBranchesUrl(String branchesUrl) {
            this.branchesUrl = branchesUrl;
        }

        public String getCloneUrl() {
            return cloneUrl;
        }

        public void setCloneUrl(String cloneUrl) {
            this.cloneUrl = cloneUrl;
        }

        public String getCollaboratorsUrl() {
            return collaboratorsUrl;
        }

        public void setCollaboratorsUrl(String collaboratorsUrl) {
            this.collaboratorsUrl = collaboratorsUrl;
        }

        public String getCommentsUrl() {
            return commentsUrl;
        }

        public void setCommentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
        }

        public String getCommitsUrl() {
            return commitsUrl;
        }

        public void setCommitsUrl(String commitsUrl) {
            this.commitsUrl = commitsUrl;
        }

        public String getCompareUrl() {
            return compareUrl;
        }

        public void setCompareUrl(String compareUrl) {
            this.compareUrl = compareUrl;
        }

        public String getContentsUrl() {
            return contentsUrl;
        }

        public void setContentsUrl(String contentsUrl) {
            this.contentsUrl = contentsUrl;
        }

        public String getContributorsUrl() {
            return contributorsUrl;
        }

        public void setContributorsUrl(String contributorsUrl) {
            this.contributorsUrl = contributorsUrl;
        }

        public String getDeploymentsUrl() {
            return deploymentsUrl;
        }

        public void setDeploymentsUrl(String deploymentsUrl) {
            this.deploymentsUrl = deploymentsUrl;
        }

        public String getDownloadsUrl() {
            return downloadsUrl;
        }

        public void setDownloadsUrl(String downloadsUrl) {
            this.downloadsUrl = downloadsUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getForksUrl() {
            return forksUrl;
        }

        public void setForksUrl(String forksUrl) {
            this.forksUrl = forksUrl;
        }

        public String getGitCommitsUrl() {
            return gitCommitsUrl;
        }

        public void setGitCommitsUrl(String gitCommitsUrl) {
            this.gitCommitsUrl = gitCommitsUrl;
        }

        public String getGitRefsUrl() {
            return gitRefsUrl;
        }

        public void setGitRefsUrl(String gitRefsUrl) {
            this.gitRefsUrl = gitRefsUrl;
        }

        public String getGitTagsUrl() {
            return gitTagsUrl;
        }

        public void setGitTagsUrl(String gitTagsUrl) {
            this.gitTagsUrl = gitTagsUrl;
        }

        public String getGitUrl() {
            return gitUrl;
        }

        public void setGitUrl(String gitUrl) {
            this.gitUrl = gitUrl;
        }

        public String getHooksUrl() {
            return hooksUrl;
        }

        public void setHooksUrl(String hooksUrl) {
            this.hooksUrl = hooksUrl;
        }

        public String getIssueCommentUrl() {
            return issueCommentUrl;
        }

        public void setIssueCommentUrl(String issueCommentUrl) {
            this.issueCommentUrl = issueCommentUrl;
        }

        public String getIssueEventsUrl() {
            return issueEventsUrl;
        }

        public void setIssueEventsUrl(String issueEventsUrl) {
            this.issueEventsUrl = issueEventsUrl;
        }

        public String getIssuesUrl() {
            return issuesUrl;
        }

        public void setIssuesUrl(String issuesUrl) {
            this.issuesUrl = issuesUrl;
        }

        public String getKeysUrl() {
            return keysUrl;
        }

        public void setKeysUrl(String keysUrl) {
            this.keysUrl = keysUrl;
        }

        public String getLabelsUrl() {
            return labelsUrl;
        }

        public void setLabelsUrl(String labelsUrl) {
            this.labelsUrl = labelsUrl;
        }

        public String getLanguagesUrl() {
            return languagesUrl;
        }

        public void setLanguagesUrl(String languagesUrl) {
            this.languagesUrl = languagesUrl;
        }

        public String getMergesUrl() {
            return mergesUrl;
        }

        public void setMergesUrl(String mergesUrl) {
            this.mergesUrl = mergesUrl;
        }

        public String getMilestonesUrl() {
            return milestonesUrl;
        }

        public void setMilestonesUrl(String milestonesUrl) {
            this.milestonesUrl = milestonesUrl;
        }

        public String getMirrorUrl() {
            return mirrorUrl;
        }

        public void setMirrorUrl(String mirrorUrl) {
            this.mirrorUrl = mirrorUrl;
        }

        public String getNotificationsUrl() {
            return notificationsUrl;
        }

        public void setNotificationsUrl(String notificationsUrl) {
            this.notificationsUrl = notificationsUrl;
        }

        public String getPullsUrl() {
            return pullsUrl;
        }

        public void setPullsUrl(String pullsUrl) {
            this.pullsUrl = pullsUrl;
        }

        public String getReleasesUrl() {
            return releasesUrl;
        }

        public void setReleasesUrl(String releasesUrl) {
            this.releasesUrl = releasesUrl;
        }

        public String getSshUrl() {
            return sshUrl;
        }

        public void setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
        }

        public String getStargazersUrl() {
            return stargazersUrl;
        }

        public void setStargazersUrl(String stargazersUrl) {
            this.stargazersUrl = stargazersUrl;
        }

        public String getStatusesUrl() {
            return statusesUrl;
        }

        public void setStatusesUrl(String statusesUrl) {
            this.statusesUrl = statusesUrl;
        }

        public String getSubscribersUrl() {
            return subscribersUrl;
        }

        public void setSubscribersUrl(String subscribersUrl) {
            this.subscribersUrl = subscribersUrl;
        }

        public String getSubscriptionUrl() {
            return subscriptionUrl;
        }

        public void setSubscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
        }

        public String getSvnUrl() {
            return svnUrl;
        }

        public void setSvnUrl(String svnUrl) {
            this.svnUrl = svnUrl;
        }

        public String getTagsUrl() {
            return tagsUrl;
        }

        public void setTagsUrl(String tagsUrl) {
            this.tagsUrl = tagsUrl;
        }

        public String getTeamsUrl() {
            return teamsUrl;
        }

        public void setTeamsUrl(String teamsUrl) {
            this.teamsUrl = teamsUrl;
        }

        public String getTreesUrl() {
            return treesUrl;
        }

        public void setTreesUrl(String treesUrl) {
            this.treesUrl = treesUrl;
        }

        public String getHomepage() {
            return homepage;
        }

        public void setHomepage(String homepage) {
            this.homepage = homepage;
        }

        public Object getLanguage() {
            return language;
        }

        public void setLanguage(Object language) {
            this.language = language;
        }

        public Integer getForksCount() {
            return forksCount;
        }

        public void setForksCount(Integer forksCount) {
            this.forksCount = forksCount;
        }

        public Integer getStargazersCount() {
            return stargazersCount;
        }

        public void setStargazersCount(Integer stargazersCount) {
            this.stargazersCount = stargazersCount;
        }

        public Integer getWatchersCount() {
            return watchersCount;
        }

        public void setWatchersCount(Integer watchersCount) {
            this.watchersCount = watchersCount;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getDefaultBranch() {
            return defaultBranch;
        }

        public void setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
        }

        public Integer getOpenIssuesCount() {
            return openIssuesCount;
        }

        public void setOpenIssuesCount(Integer openIssuesCount) {
            this.openIssuesCount = openIssuesCount;
        }

    }

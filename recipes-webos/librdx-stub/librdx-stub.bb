# (c) Copyright 2012  Hewlett-Packard Development Company, L.P. 

SUMMARY = "Stubbed version of the webOS Remote Diagnostics Library"
SECTION = "webos/libs"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

PROVIDES = "librdx"

# corresponds to tag submissions/9
SRCREV = "f226cb05b15bca20903a28ffa2753909d9ad35da"
PV = "2.0.0-9"
PR = "r4"

inherit webos_component
inherit webos_public_repo
inherit webos_enhanced_submissions
inherit webos_cmake
inherit webos_library

WEBOS_GIT_TAG = "submissions/${WEBOS_SUBMISSION}" 
SRC_URI = "${OPENWEBOS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"

# Must set DEBIAN_NOAUTONAME for all of the packages created by this recipe
DEBIAN_NOAUTONAME_${PN} = "1"
DEBIAN_NOAUTONAME_${PN}-dbg = "1"
DEBIAN_NOAUTONAME_${PN}-dev = "1"

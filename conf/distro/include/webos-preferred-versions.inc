# Copyright (c) 2012-2013  Hewlett-Packard Development Company, L.P.
# Copyright (c) 2013 LG Electronics

#
# NOTE: Keep the lists in alphabetical order
#

# Upstream components don't have submissions
PREFERRED_VERSION_db ?= "4.8.30"
PREFERRED_VERSION_linux-yocto ?= "3.4%"
# Stick to latest udev version provided by oe-core
PREFERRED_VERSION_udev ?= "164"
PREFERRED_VERSION_vboxguestdrivers ?= "4.2.6"
# Newer upstream meta-oe already has yajl 2.0.3 which isn't compatible with our libpbnjson yet
# https://github.com/openwebos/libpbnjson/pull/2
PREFERRED_VERSION_yajl ?= "1.0.12"

# Components that inherit from either webos_enhanced_submissions or webos_submissions
# must have a PREFERRED_VERSION with format: <component-version>-<submission>

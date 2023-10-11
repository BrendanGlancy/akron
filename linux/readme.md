# Intro To Unix / Linux

## Table of Contents
1. [Introduction to Unix/Linux](#introduction-to-unixlinux)
   1. [Known Commands](#known-commands)
   2. [Unknown Commands](#unknown-commands)
   3. [Commands for the Test](#commands-for-the-test)
2. [Linux Directory Hierarchy](#linux-directory-hierarchy)
3. [Part 2 | Devices](#part-2--devices)
   1. [Foundation](#foundation)
   2. [On Devices](#on-devices)
   3. [Review on Environment Variables](#review-on-environment-variables)
   4. [From ls /dev to /sys/fs](#from-ls-dev-to-sysfs)

**Professor John Hoag**: Polysky 211

Commands I knew coming into this class [#known-commands]

```bash
ls
ls -la
mkdir 
cd
rm
rmdir
rm -rf
echo
sh
chmod
grep
init
ping
wget
whoami
clear
mv
cp
man
shutdown
ifconfig && ipconfig
traceroute
kill
Netcat && nc
mount
passwd
sleep
man
su
```

```bash
-- import note I have all of these remappped to neovim on all PC's
vi
vim
nvim
```

## Commands I don't know 

```bash
df
cron
nslookup
dd
find
gzip
chown
fdisk
tee
```

## Command that will be on the test

```bash
# list
ls 
ls -tal

# manual  
man

# change directory
cd 

# examples going up and down the directory tree
cd [filename]
cd .. 

# text editor 
nano

# make directory
mkdir

# print working directory
pwd

# remove
rm

# remove directory
rmdir

# change mode 
chmod

# (modes) rwx - read write execute
```

```zsh
# example
chmod 777 
# allows all users to read write and execute a file
```
0 = no permissions whatsoever; this person cannot read, write, or execute the file.
1 = execute only.
2 = write only.
3 = write and execute (1+2)
4 = read only.
5 = read and execute (4+1)
6 = read and write (4+2)
7 = read and write and execute (4+2+1)

When you remove a file "rm" it is not actually deleted but rather it is just no longer allocated in memory. Meaning that file you "deleted" is sitting in your ram waiting to be overridden


# Linux Directory Hierarchy

## `/` - Root Directory
The starting point for the file system hierarchy.

---

### `/bin` - Essential User Binaries
Contains essential command binaries.

---

### `/boot` - Boot Files
Kernel and boot files.

---

### `/dev` - Device Files
Special device files.

#### `/dev/null`
A null device.

---

### `/etc` - Configuration Files
System-wide configuration files and shell scripts.

#### `/etc/fstab`
File system table file.

#### `/etc/passwd`
User account information.

---

### `/home` - Home Directories
Home directories for users.

#### `/home/username`
A user's home directory.

---

### `/lib` - Essential Shared Libraries
Contains libraries for `/bin` and `/sbin`.

---

### `/media` - Removable Media
Mount point for removable media.

---

### `/mnt` - Temporary Mount Points
Temporary mount points for filesystems.

---

### `/opt` - Optional Software
Optional application software packages.

---

### `/proc` - Process Information
Virtual directory for system information.

---

### `/root` - Root Home
Home directory for the root user.

---

### `/sbin` - System Binaries
Contains system administration binaries.

---

### `/srv` - Service Data
Data for services provided by the system.

---

### `/tmp` - Temporary Files
Contains temporary files (cleared on reboot).

---

### `/usr` - User Binaries and Read-Only Data

#### `/usr/bin`
Non-essential command binaries.

#### `/usr/lib`
Non-essential libraries.

#### `/usr/local`
Local hierarchy.

---

### `/var` - Variable Files
Variable data like logs, databases, etc.

#### `/var/log`
Log files.

#### `/var/mail`
Mailbox files.

---

### Notes from John, day before the test

Whats in:
- "home folder" per pwd
- List using ls (ls -tal)
- Navigate using cd (up: cd ..)
- Nano, to create text files
- Wildcards
- Couple new commands

Whats out
- [Symbolic] Links

```bash
# Wildcard command, this list all files that start with a b, since * represents a character that matches every char
ls b*

# Copy
cp

# move
mv

# make directory
mkdir

# remove
rm

# Create hard and symbolic links
ln
```

| Wildcard | Description                                    | Example          | Matches                        |
|----------|------------------------------------------------|------------------|---------------------------------|
| *        | Matches zero or more characters                | `*.txt`          | All `.txt` files                |
| ?        | Matches exactly one character                  | `?.txt`          | `a.txt`, `1.txt`, but not `aa.txt` |
| []       | Matches any single character within the brackets| `[abc].txt`      | `a.txt`, `b.txt`, `c.txt`       |
| [!...]   | Matches any single character NOT within the brackets| `[!abc].txt`  | `d.txt`, `e.txt`               |
| [a-z]    | Matches any single character within the specified range | `[a-c].txt`  | `a.txt`, `b.txt`, `c.txt`     |
| {}       | Matches any of the comma-separated patterns enclosed | `{a,b}.txt`    | `a.txt`, `b.txt`               |

# Part 2 | Devices

Part II is on devices, covers chapter 3 and 4

**Foundation**
- Everything in Unix is a file (name, place, attributes) - whether a file or not!

This chapter is a basic tour of the kernal-provided device infrastructure in a functioning Linux system. 

### On Devices
- Kernal presents I/O interfaces to user as files
- Device interfaces reside in the /dev directory 
    - `ls -l /dev | more`
    - Reveals device inventory but deemed not helpful
    - Yours should reveal many tty's (cf Teletype)
- Four notional types
    - Block (ie, bulk or chunked)
    - Character 
    - Pipe
    - Socket (we will defer this, of occasional use to programmers)
    - Note: ls -tal will reveal the mode interface, typically b or c prepended to permissions

### Review on environment variables
- From your VM
    - "go home" uses "tilde" `cd ~`
- Display environment variables using env - suggest: `env | more`
- Environment variable are dynamic, local, personal
    - Are defaults for use by application program
    - Are defaults for use at CLI
- Foremost is PATH
    - Concatenation of locations in priority order to seek for file (each rwx)
    - Installer should append new program's direcotyr to PATH
    - Echo $PATH

### Form ls /dev to /sys/fs
- Alternative locus to interface for each device, by type
    - These are symbolic links, mentioned in Ward Ch02
- Whereas ls is to view, /sys/fs exists to add/modify/delete (A/M/D)
    - It's OK to look: /sys/dev enumerates block and character interfaces
    - Do: cd to sys/dev/block an run ls -l to see specific interfaces and locatin
- Its presence does not infer the exact tool(s) used to `udevadm info --query=all --name=/dev/sda`
- Simple sample query - only approved use of udevadm (Section 3.5)

Commands we covered:
- dd
- cronjobs
    - `crontab -e`
- Daemons

## Frameworks / Schemas for learning
- Just a structure, details forthcoming, for consistency
- Three-layer model: userland, OS, Hardware
- OS manages two kinds of resources: computer and memory
- Every resource "is a file" with name, place, attributes
- CPU Time moves fast (frequency in GHz) time allocated in "slices"
- Multiple levels of details - and all are true
- Course attention to: storage, startup, networking, security
- Everything we teach should fit into your Framework

**3.5 on udev ... omit**

### Transition to 3.6 on SCSII

- Small Computer System interfaces
    - Deprecated, in that we don't actually connect to modern devices this way
    - Signature "daisy chain" serialized cabling, such that devices numbered 0-7 
    - Relevant in that Unix kernal refers to mass storage (HDD, SSD, CD-R) as SCSI
- Keyword topology: structure matters
    - Figure 4.1 in the boolk describes a functional set of peers on a bus topology
    - Was structurally true, once, and that's what metters to Unix
    - Modern approach is hierarchical, through a controller - workable on a chassis
    - We have other general options: star, mesh, etc


### A Reconciliation
- In kernal level, for all things block
- To "know how to talk to..."
- Note real hardware types, bottom
    - SATA disks, CD/DVD,USB
    - With respective driver
- Hard drives undergo "translation"
    - From SCSI to SATA
- Note bifurcation of sda and sr0 types
- Different process can use diff drivers

### Disk Drives as a metaphor for storage

- AKA mass storage
- Magnetice tape is linear, ie with beginning and end, cassette Optional
- Notional disk, ie platter, has concentirc rings such that 
    - typology: hard (not removable) or floppy (removable)
- Hard Disk Physical Structure - also Section 4.1.

---

- Recall that resource attributes are rwx (and maybe d, b, c)
- Consider that access can be random or sequential with respect to rwx
- Tape is intrinsically linear, and may or may not have directory at front 
- Disk is intrinsically random, and it requires a directory (and more)
- Note that file objects are permitted to have various sizes
    - which makes access interesting

### Partitions 

- To be considered part of the "Unix Legacy" - show we start a list
    - ASCII character, SCSI drives, 80-column screens, command lines 
- As root, perform: parted -l [partition editor, one of many]
- Notable consequences 
    - Can have multiple partitions on one physical device
    - One is deemed bootable, to contain, to contain the "master boot record"
        - Start here: is amenable to OS updates
        - Other may not even run often, and require intervention to update

### MBR: Master boot record

- From parted -l
- Primary partition contains content that is automatically executed first
    - Mine display program called a loader, named grub
    - Mine also displays the Windows partition form Virtualbox
- Secondary and extended partitions available 
- Pay attention:
    - Command fdisk -l provides a useful view of physicla and logical devices
    - Use of fdisk with other operand will change machine setup and perhaps "instability"


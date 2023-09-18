# Intro To Unix / Linux

**Professor John Hoag**: Polysky 211

Commands I knew coming into this class

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

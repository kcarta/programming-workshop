# Linux

## installation

There are two easy ways you can install linux for use in this workshop

### Install [Linux subsystem on Windows](https://en.wikipedia.org/wiki/Windows_Subsystem_for_Linux)

1. Open Powershell as Administrator
2. Run the following command `Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Windows-Subsystem-Linux`
3. When prompted reboot your computer
4. Open command line or powershell and run the command `bash`
5. Once the program downloads bash will start
6. You can now start **bash** from the start menu under the name *Bash on Ubuntu on Windows*

[MSDN LSW Windows 10 Installation Guide](https://msdn.microsoft.com/en-us/commandline/wsl/install_guide)

### Install [VirtualBox][1] and run the included image

[Google Drive folder with Ubuntu VM images][2]

1. Download the .7z archive from [Google Drive][2] (if you don't have 7zip you can also download the .zip archive)
2. Unpack the archive and run the [VirtualBox][1] install file (this may take a bit)
3. Follow the onscreen instructions for installation
4. Move the **Ubuntu_Proficiency_Course_student** folder to a temporary location
5. Running the **Ubuntu_Proficiency_Course_student.vbox** file after installing VirtualBox should start the VM
6. Username and Password for the Ubuntu image are in the **Account.txt** file in the drive


[1]:https://www.virtualbox.org/
[2]:https://drive.google.com/drive/folders/0B-ED8IXwXPIGR19Ra3ZfT3BFbzA?usp=sharing

## Learning terminal

### [Terminus][3]

[Terminus][3] is a text adventure game to learn about terminal command line interfaces

### [VIM Adventures][4]

[VIM Adventures][4] is a very simple game where you can learn the basics of [vim][5]

[3]:http://web.mit.edu/mprat/Public/web/Terminus/Web/main.html
[4]:https://vim-adventures.com/
[5]:https://vim.sourceforge.io/
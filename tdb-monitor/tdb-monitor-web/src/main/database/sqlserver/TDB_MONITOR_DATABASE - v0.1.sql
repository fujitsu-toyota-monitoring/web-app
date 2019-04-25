USE [master]
GO

/****** Object:  Database [TDB_MONITOR] ******/
CREATE DATABASE [TDB_MONITOR]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'TDB_MONITOR', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\TDB_MONITOR.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'TDB_MONITOR_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\TDB_MONITOR_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO

ALTER DATABASE [TDB_MONITOR] SET COMPATIBILITY_LEVEL = 140
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [TDB_MONITOR].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [TDB_MONITOR] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET ARITHABORT OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [TDB_MONITOR] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [TDB_MONITOR] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET  DISABLE_BROKER 
GO

ALTER DATABASE [TDB_MONITOR] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [TDB_MONITOR] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET RECOVERY FULL 
GO

ALTER DATABASE [TDB_MONITOR] SET  MULTI_USER 
GO

ALTER DATABASE [TDB_MONITOR] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [TDB_MONITOR] SET DB_CHAINING OFF 
GO

ALTER DATABASE [TDB_MONITOR] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [TDB_MONITOR] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO

ALTER DATABASE [TDB_MONITOR] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [TDB_MONITOR] SET QUERY_STORE = OFF
GO

ALTER DATABASE [TDB_MONITOR] SET  READ_WRITE 
GO

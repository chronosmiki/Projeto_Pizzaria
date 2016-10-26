-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Tempo de geração: 26/10/2016 às 05:51
-- Versão do servidor: 10.1.16-MariaDB
-- Versão do PHP: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projeto_pizzaria`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL,
  `nome` tinytext NOT NULL,
  `sobrenome` tinytext NOT NULL,
  `telefone` int(11) NOT NULL,
  `data_cad` date NOT NULL,
  `email` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabela que armazena informações dos clientes..';

--
-- Fazendo dump de dados para tabela `clientes`
--

INSERT INTO `clientes` (`idCliente`, `nome`, `sobrenome`, `telefone`, `data_cad`, `email`) VALUES
(1, 'Vitor', 'Pereira', 21158425, '2016-09-05', 'vitorj0829@hotmail.com');

-- --------------------------------------------------------

--
-- Estrutura para tabela `detalhes_fornecedores`
--

CREATE TABLE `detalhes_fornecedores` (
  `id_detalhes_fornecedores` int(11) NOT NULL,
  `id_fornecedor` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `detalhes_pedidos`
--

CREATE TABLE `detalhes_pedidos` (
  `id_detalhes` int(11) NOT NULL,
  `num_pedido` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabela de união entre produtos e pedidos';

-- --------------------------------------------------------

--
-- Estrutura para tabela `enderecos`
--

CREATE TABLE `enderecos` (
  `idendereco` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `logradouro` text NOT NULL,
  `numero` int(11) NOT NULL,
  `bairro` text NOT NULL,
  `municipio` text NOT NULL,
  `estado` text NOT NULL,
  `cep` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabela para armazenar endereços dos clientes.';

--
-- Fazendo dump de dados para tabela `enderecos`
--

INSERT INTO `enderecos` (`idendereco`, `tipo`, `logradouro`, `numero`, `bairro`, `municipio`, `estado`, `cep`, `id_cliente`) VALUES
(1, 'Rua', 'Costa Barros', 131, 'Vila Alpina', 'São Paulo', 'São Paulo', 3210000, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `estoque`
--

CREATE TABLE `estoque` (
  `id_estoque` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `id_detalhes_fornecedores` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `dataUltimaCompra` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `fornecedores`
--

CREATE TABLE `fornecedores` (
  `id_fornecedor` int(11) NOT NULL,
  `razaoSocial` text NOT NULL,
  `cnpj` text NOT NULL,
  `id_endereco` text NOT NULL,
  `dataCadastro` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedidos`
--

CREATE TABLE `pedidos` (
  `num_pedido` int(11) NOT NULL,
  `valor_total` decimal(10,0) NOT NULL,
  `data` date NOT NULL,
  `metod_pag` text NOT NULL,
  `delivery` tinyint(1) NOT NULL,
  `id_detalhe` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabela que armazena os pedidos feitos';

-- --------------------------------------------------------

--
-- Estrutura para tabela `produtos`
--

CREATE TABLE `produtos` (
  `id_produto` int(11) NOT NULL,
  `tipoProduto` text,
  `detalheProduto` text NOT NULL,
  `precoUnitario` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabela que armazena produtos.';

--
-- Fazendo dump de dados para tabela `produtos`
--

INSERT INTO `produtos` (`id_produto`, `tipoProduto`, `detalheProduto`, `precoUnitario`) VALUES
(1, 'Pizza', 'Mussarela', 30),
(2, 'Bebida', 'Coca Cola 2L', 4.5),
(3, 'calabreza', 'calabreza', 20),
(4, 'Pizza Doce', 'Romeu e Julieta', 35),
(5, 'Bebida', 'Guarana Antartica', 4.5),
(6, 'Bebida', 'Suco Del Valle', 3),
(7, 'Esfiha Doce', 'chocolate', 10);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `idusuarios` int(11) NOT NULL,
  `nome` tinytext NOT NULL,
  `sobrenome` tinytext NOT NULL,
  `login` tinytext NOT NULL,
  `password` tinytext NOT NULL,
  `nivel` int(11) NOT NULL COMMENT 'Nivel do usuário no sistema...\n\n1-)Adm;\n2-)Usuário;'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabela de cadastros para usuários do sistema.';

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`);

--
-- Índices de tabela `detalhes_fornecedores`
--
ALTER TABLE `detalhes_fornecedores`
  ADD PRIMARY KEY (`id_detalhes_fornecedores`);

--
-- Índices de tabela `detalhes_pedidos`
--
ALTER TABLE `detalhes_pedidos`
  ADD PRIMARY KEY (`id_detalhes`);

--
-- Índices de tabela `enderecos`
--
ALTER TABLE `enderecos`
  ADD PRIMARY KEY (`idendereco`),
  ADD KEY `id_cliente_idx` (`id_cliente`);

--
-- Índices de tabela `estoque`
--
ALTER TABLE `estoque`
  ADD PRIMARY KEY (`id_estoque`);

--
-- Índices de tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Índices de tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`num_pedido`);

--
-- Índices de tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id_produto`);

--
-- Índices de tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idusuarios`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de tabela `detalhes_fornecedores`
--
ALTER TABLE `detalhes_fornecedores`
  MODIFY `id_detalhes_fornecedores` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `detalhes_pedidos`
--
ALTER TABLE `detalhes_pedidos`
  MODIFY `id_detalhes` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `enderecos`
--
ALTER TABLE `enderecos`
  MODIFY `idendereco` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de tabela `estoque`
--
ALTER TABLE `estoque`
  MODIFY `id_estoque` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `num_pedido` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idusuarios` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restrições para dumps de tabelas
--

--
-- Restrições para tabelas `enderecos`
--
ALTER TABLE `enderecos`
  ADD CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
